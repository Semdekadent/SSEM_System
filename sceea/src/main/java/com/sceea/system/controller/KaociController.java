package com.sceea.system.controller;

import com.sceea.system.po.Kaoci;
import com.sceea.system.service.ExamService;
import com.sceea.system.service.KaociService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/Kaoci")
public class KaociController {
    /*@ResponseBody
    @PostMapping(path = "/upload")
    @ApiImplicitParams({
            @ApiImplicitParam(name="uploadPath",value="上传文件路径",defaultValue ="/",required = false,dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "file" ,value="file",required = false,dataType = "file",paramType = "form")
    })
    public String uploadFile(HttpServletRequest request){
        return null;
    }*/
    @Autowired
    KaociService kaociService;
    @Autowired
    ExamService examService;

    @ResponseBody
    @PostMapping("/Arrangement")
    public boolean arrangement(@RequestBody Kaoci kaoci){
        Kaoci temp = new Kaoci();
        temp.setKaociId(kaoci.getKaociId());
        temp.setExamAssignmentTime(kaoci.getExamAssignmentTime());
        temp.setExamEquipment(kaoci.getExamEquipment());
        temp.setRecordPrint(kaoci.getRecordPrint());

        if((temp.getRecordPrint().getTime()-temp.getExamAssignmentTime().getTime())/60/60/24<7)
            return false;
        if((temp.getExamAssignmentTime().getTime()-examService.getExam(kaoci.getExamId()).getExamRgstEdate().getTime())/60/60/24<7)
            return false;
        temp.setFileSize(kaoci.getFileSize());
        kaociService.setArrangement(temp);
        return true;
    }

    @ResponseBody
    @PostMapping("/upload")
    public String upload(HttpServletRequest request,
                          int id,
                         @RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
        if (!file.isEmpty()) {
            // 构建上传文件的存放路径
            /*String path = request.getServletContext().getRealPath("/");*/
            File directory = new File("src/main/resources/markproject");
            String path = directory.getCanonicalPath();
            System.out.println(path);
            // 获取上传的文件名称，并结合存放路径，构建新的文件名称
            String name=file.getOriginalFilename();
            String filename = "考次"+Integer.toString(id)+"阅卷计划"+name.substring(name.lastIndexOf("."));
            System.out.println(filename);
            File filepath = new File(path, filename);

            // 判断路径是否存在，不存在则新创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            //如果已存在，即覆盖阅卷计划，将原本的进行删除
            if(filepath.exists()){
                filepath.delete();
            }
            // 将上传文件保存到目标文件目录
            file.transferTo(new File(path + File.separator + filename));
            kaociService.setMarkProject(id,path+filename);

            return "success";
        } else {
            return "error";
        }
    }
}

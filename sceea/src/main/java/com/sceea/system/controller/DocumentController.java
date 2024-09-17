package com.sceea.system.controller;


import com.sceea.system.po.Document;
import com.sceea.system.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/Document")
public class DocumentController {
    @Autowired
    DocumentService documentService;
    @ResponseBody
    @GetMapping("getAll")
    public List<Document> getAll(){
        return documentService.getAllDocument();
    }

    @ResponseBody
    @PostMapping("/upload")
    public String upload(Document param,
                         @RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
        if (!file.isEmpty()) {
            // 构建上传文件的存放路径
            File directory = new File("src/main/resources/document");
            String path = directory.getCanonicalPath();
            System.out.println(path);
            // 获取上传的文件名称，并结合存放路径，构建新的文件名称
            String type="";
            if(param.getDocType()==0){
                type="实践";
            }else if(param.getDocType()==1){
                type="机试";
            }else if(param.getDocType()==2){
                type="论文";
            }
            String name=file.getOriginalFilename();
            String filename = "考试文档"+"_"+type+"_"+param.getDocName()+name.substring(name.lastIndexOf("."));
            System.out.println(filename);
            File filepath = new File(path, filename);
            // 判断路径是否存在，不存在则新创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            // 将上传文件保存到目标文件目录
            file.transferTo(new File(path + File.separator + filename));
            param.setAddress(path + File.separator + filename);
            documentService.addDocument(param);

            return "success";
        } else {
            return "error";
        }
    }
    @ResponseBody
    @DeleteMapping("/delete")
    public void deleteDocument(@RequestBody int id){
        File file = new File(documentService.getDocument(id).getAddress());
        if(file.exists()) {
            file.delete();
            System.out.println("删除成功");
        }
        documentService.deleteDocument(id);
    }

    @ResponseBody
    @PostMapping("/download")
    public ResponseEntity<InputStreamResource> downloadFile(int id)
            throws IOException {
        String filePath =  documentService.getDocument(id).getAddress();;
        FileSystemResource file = new FileSystemResource(filePath);
        HttpHeaders headers = new HttpHeaders();
        String name=file.getFilename();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"",documentService.getDocument(id).getDocName()+name.substring(name.lastIndexOf("."))));
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentLength(file.contentLength())
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .body(new InputStreamResource(file.getInputStream()));
    }
}

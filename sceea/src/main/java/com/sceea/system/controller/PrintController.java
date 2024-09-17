package com.sceea.system.controller;

import com.sceea.system.bo.ExamInfoList;
import com.sceea.system.mapper.KaociMapper;
import com.sceea.system.po.ExamInfo;
import com.sceea.system.service.PrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/print")
public class PrintController {
    @Autowired
    PrintService printService;

    @ResponseBody
    @PostMapping("/ExamroomInfo")
    public List<ExamInfo> printExamroom(int examroomId, int kaociId){
        return printService.printExamroom(examroomId,kaociId);
    }

    @ResponseBody
    @PostMapping("/StudentInfo")
    public ExamInfoList printStudentInfo(int examId,String id){
        return printService.printExamInfo(examId,id);
    }
}

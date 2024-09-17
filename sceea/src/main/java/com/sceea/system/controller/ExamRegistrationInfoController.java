package com.sceea.system.controller;

import com.sceea.system.po.ExamRegistrationInfo;
import com.sceea.system.service.ExamRegistrationInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/ExamRegistrationInfo")
public class ExamRegistrationInfoController {
    @Autowired
    ExamRegistrationInfoService examRegistrationInfoService;
    @ResponseBody
    @PostMapping("/getKaociExamRegistrationInfo")
    public List<ExamRegistrationInfo> getKaociExamRegistrationInfo(@RequestBody int id){
        return examRegistrationInfoService.getKaociExamRegistrationInfo(id);
    }

    @ResponseBody
    @PostMapping("/getDistrictExamRegistrationInfo")
    public List<ExamRegistrationInfo> getDistrictExamRegistrationInfo(int districtId, int kaociId){
        return examRegistrationInfoService.getDistrictExamRegistrationInfo(districtId,kaociId);
    }
    @ResponseBody
    @PostMapping("/getDistrictExamRegistrationInfoNum")
    public int getDistrictExamRegistrationInfoNum(int districtId, int kaociId){
        return examRegistrationInfoService.getDistrictExamRegistrationInfo(districtId,kaociId).size();
    }

}

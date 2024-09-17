package com.sceea.system.controller;

import com.sceea.system.po.ExamAssignment;
import com.sceea.system.po.ExamRoom;
import com.sceea.system.po.Kaoci;
import com.sceea.system.service.ExamAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/ExamAssignment")
public class ExamAssignmentController {
    @Autowired
    ExamAssignmentService examAssignmentService;
    @ResponseBody
    @PostMapping("/getSelected")
    public List<ExamAssignment> getDistrict(int districtId,int kaociId){
        return examAssignmentService.selectDistrictExamAssignment(districtId,kaociId);
    }
    @ResponseBody
    @PostMapping("/getNotSelected")
    public List<ExamRoom> getLeft(int districtId, int examTime){
        return examAssignmentService.selectLeftExamRoom(districtId,examTime);
    }
    @ResponseBody
    @PostMapping("/addExamAssignment")
    public boolean addExamAssignment(@RequestBody ExamAssignment examAssignment){
        return examAssignmentService.addExamAssignment(examAssignment);
    }
    @ResponseBody
    @DeleteMapping("/deleteExamAssignment")
    public boolean deleteExamAssignment(@RequestBody int id){
        return examAssignmentService.deleteExamAssignment(id);
    }
    @ResponseBody
    @PostMapping("/save")
    public boolean save(int districtId,int kaociId){
        return examAssignmentService.save(districtId,kaociId);
    }

}

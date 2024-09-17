package com.sceea.system.controller;

import com.sceea.system.mapper.ExamLocationMapper;
import com.sceea.system.po.ExamLocation;
import com.sceea.system.service.ExamLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/ExamLocation")
public class ExamLocationController {
    @Autowired
    ExamLocationService examLocationService;
    @ResponseBody
    @GetMapping("/getAll")
    public List<ExamLocation> getAllExamLocation(){
        List<ExamLocation> result = examLocationService.getAllExamLocation();
        return result;
    }
    @ResponseBody
    @PutMapping("/getDistrictAll")
    public List<ExamLocation> getDistrictAll(@RequestBody int id){
        List<ExamLocation> result = examLocationService.getDistrictAll(id);
        return result;
    }

    @ResponseBody
    @PutMapping("/update")
    public boolean setExamLocation(@RequestBody ExamLocation param){
        return examLocationService.setExamLocation(param);
    }

    @ResponseBody
    @PostMapping ("/add")
    public boolean addExamLocation(@RequestBody ExamLocation param){
        return examLocationService.addExamLocation(param);
    }

    @ResponseBody
    @DeleteMapping ("/delete")
    public boolean deleteExamLocation(@RequestBody int id){
        return examLocationService.deleteExamLocation(id);
    }
}

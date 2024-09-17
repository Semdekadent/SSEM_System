package com.sceea.system.controller;

import com.sceea.system.po.College;
import com.sceea.system.po.MarkInstitutions;
import com.sceea.system.service.MarkInstitutionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/MarkInstitutions")
public class MarkInstitutionsController {
    @Autowired
    MarkInstitutionsService markInstitutionsService;
    @ResponseBody
    @PutMapping("/getKaociAll")
    public List<MarkInstitutions> getKaociAll(@RequestBody int id){
        List<MarkInstitutions> result = markInstitutionsService.getKaociAll(id);
        return result;
    }

    @ResponseBody
    @PutMapping("/getLeftAll")
    public List<College> getLeftAll(@RequestBody int id){
        List<College> result = markInstitutionsService.getLeftAll(id);
        return result;
    }

    @ResponseBody
    @PostMapping("/add")
    public boolean addMarkInstitutions(@RequestBody MarkInstitutions param){
        return markInstitutionsService.addMarkInstitutions(param);
    }

    @ResponseBody
    @DeleteMapping ("/delete")
    public boolean deleteMarkInstitutions(@RequestBody int id){
        return markInstitutionsService.deleteMarkInstitutions(id);
    }



}

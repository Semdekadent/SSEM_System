package com.sceea.system.controller;

import com.sceea.system.po.IllegalCase;
import com.sceea.system.po.IllegalCode;
import com.sceea.system.service.IllegalCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/IllegalCase")
public class IllegalCaseController {
    @Autowired
    IllegalCaseService illegalCaseService;
    @ResponseBody
    @GetMapping("/getAll")
    public List<IllegalCase> getAllIllegalCase(){
        List<IllegalCase> result = illegalCaseService.getAllIllegalCase();
        return result;
    }
    @ResponseBody
    @PostMapping("/search")
    public List<IllegalCase> getKeyIllegalCase(@RequestBody String word){
        List<IllegalCase> result = illegalCaseService.getKeyIllegalCase(word);
        return result;
    }

    @ResponseBody
    @PutMapping("/update")
    public boolean setIllegalCase(@RequestBody IllegalCase param){
        return illegalCaseService.setIllegalCase(param);
    }

    @ResponseBody
    @PostMapping ("/add")
    public boolean addIllegalCase(@RequestBody IllegalCase param){
        return illegalCaseService.addIllegalCase(param);
    }
    @ResponseBody
    @DeleteMapping ("/delete")
    public boolean deleteIllegalCase(@RequestBody int id){
        return illegalCaseService.deleteIllegalCase(id);
    }
}

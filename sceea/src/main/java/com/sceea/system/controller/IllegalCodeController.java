package com.sceea.system.controller;

import com.sceea.system.po.IllegalCode;
import com.sceea.system.po.PunishmentCode;
import com.sceea.system.service.IllegalCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/IllegalCode")
public class IllegalCodeController {
    @Autowired
    IllegalCodeService illegalCodeService;
    @ResponseBody
    @GetMapping("/getAll")
    public List<IllegalCode> getAllIllegalCode(){
        List<IllegalCode> result = illegalCodeService.getAllIllegalCode();
        return result;
    }

    @ResponseBody
    @PutMapping("/update")
    public boolean setIllegalCode(@RequestBody IllegalCode param){
        return illegalCodeService.setIllegalCode(param);
    }

    @ResponseBody
    @PostMapping ("/add")
    public boolean addIllegalCode(@RequestBody IllegalCode param){
        return illegalCodeService.addIllegalCode(param);
    }
    @ResponseBody
    @DeleteMapping ("/delete")
    public boolean deleteIllegalCode(@RequestBody int id){
        return illegalCodeService.deleteIllegalCode(id);
    }

}

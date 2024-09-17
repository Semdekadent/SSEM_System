package com.sceea.system.controller;

import com.sceea.system.mapper.PunishmentCodeMapper;
import com.sceea.system.po.PunishmentCode;
import com.sceea.system.service.PunishmentCodeService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/PunishmentCode")
public class PunishmentCodeController {
    @Autowired
    PunishmentCodeService punishmentCodeService;
    @ResponseBody
    @GetMapping("/getAll")
    public List<PunishmentCode> getAllPunishmentCode(){
        List<PunishmentCode> result = punishmentCodeService.getAllPunishmentCode();
        return result;
    }

    @ResponseBody
    @PutMapping("/update")
    public boolean setPunishmentCode(@RequestBody PunishmentCode param){
        return punishmentCodeService.setPunishmentCode(param);
    }

    @ResponseBody
    @PostMapping ("/add")
    public boolean addPunishmentCode(@RequestBody PunishmentCode param){
        return punishmentCodeService.addPunishmentCode(param);
    }

    @ResponseBody
    @DeleteMapping ("/delete")
    public boolean deletePunishmentCode(@RequestBody int id){
        return punishmentCodeService.deletePunishmentCode(id);
    }


}

package com.sceea.system.controller;

import com.sceea.system.po.ExamLocation;
import com.sceea.system.po.ExamRoom;
import com.sceea.system.service.ExamRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/ExamRoom")
public class ExamRoomController {
    @Autowired
    ExamRoomService examRoomService;
    @ResponseBody
    @GetMapping("/getAll")
    public List<ExamRoom> getAllExamRoom(){
        List<ExamRoom> result = examRoomService.getAllExamRoom();
        return result;
    }
    @ResponseBody
    @PutMapping("/getExamLocationAll")
    public List<ExamRoom> getExamLocationAll(@RequestBody int id){
        List<ExamRoom> result = examRoomService.getExamLocationAll(id);
        return result;
    }

    @ResponseBody
    @PutMapping("/update")
    public boolean setExamRoom(@RequestBody ExamRoom param){
        return examRoomService.setExamRoom(param);
    }

    @ResponseBody
    @PostMapping ("/add")
    public boolean addExamRoom(@RequestBody ExamRoom param){
        return examRoomService.addExamRoom(param);
    }

    @ResponseBody
    @DeleteMapping ("/delete")
    public boolean deleteExamRoom(@RequestBody int id){
        return examRoomService.deleteExamRoom(id);
    }
}

package com.sceea.system.controller;

import com.sceea.system.po.Report;
import com.sceea.system.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Report")
public class ReportController {
    @Autowired
    ReportService reportService;
    @ResponseBody
    @PostMapping("/getReport")
    public Report getAssignmentReport(@RequestBody Integer id){
        return reportService.selectAssignment(id);
    }
    @ResponseBody
    @PostMapping("/setReport")
    public boolean setReport(@RequestBody Report report){
        return reportService.setReport(report);
    }

}

package com.sceea.system.service.impl;

import com.sceea.system.mapper.ReportMapper;
import com.sceea.system.po.Report;
import com.sceea.system.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    ReportMapper reportMapper;
    @Override
    public Report selectAssignment(int id) {
        return reportMapper.selectAssignment(id);
    }

    @Override
    public boolean setReport(Report report) {
        return reportMapper.updateByPrimaryKeySelective(report)>0?true:false;
    }
}

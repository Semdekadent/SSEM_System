package com.sceea.system.service;

import com.sceea.system.po.Report;
import org.springframework.stereotype.Service;

@Service
public interface ReportService {
    public Report selectAssignment(int id);
    public boolean setReport(Report report);
}

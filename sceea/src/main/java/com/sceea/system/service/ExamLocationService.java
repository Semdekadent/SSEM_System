package com.sceea.system.service;

import com.sceea.system.po.ExamLocation;
import com.sceea.system.po.PunishmentCode;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ExamLocationService {
    public List<ExamLocation> getAllExamLocation();
    public List<ExamLocation> getDistrictAll(int id);
    public boolean setExamLocation(ExamLocation examLocation);
    public boolean addExamLocation(ExamLocation examLocation);
    public boolean deleteExamLocation(int id);
}

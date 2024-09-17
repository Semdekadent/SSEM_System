package com.sceea.system.service;

import com.sceea.system.po.ExamRegistrationInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExamRegistrationInfoService {
    public List<ExamRegistrationInfo> getKaociExamRegistrationInfo(Integer kaociId);
    public List<ExamRegistrationInfo>  getDistrictExamRegistrationInfo(Integer districtId,Integer kaociId);
}

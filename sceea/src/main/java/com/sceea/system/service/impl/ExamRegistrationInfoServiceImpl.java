package com.sceea.system.service.impl;

import com.sceea.system.mapper.ExamRegistrationInfoMapper;
import com.sceea.system.po.ExamRegistrationInfo;
import com.sceea.system.service.ExamRegistrationInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamRegistrationInfoServiceImpl implements ExamRegistrationInfoService {
    @Autowired
    ExamRegistrationInfoMapper examRegistrationInfoMapper;
    @Override
    public List<ExamRegistrationInfo> getKaociExamRegistrationInfo(Integer kaociId) {
        return examRegistrationInfoMapper.selectKaociExamRegistrationInfo(kaociId);
    }

    @Override
    public List<ExamRegistrationInfo> getDistrictExamRegistrationInfo(Integer districtId, Integer kaociId) {
        return examRegistrationInfoMapper.selectDistrictExamRegistrationInfo(districtId,kaociId);
    }
}

package com.sceea.system.service.impl;

import com.sceea.system.mapper.ExamLocationMapper;
import com.sceea.system.po.ExamLocation;
import com.sceea.system.service.ExamLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExamLocationServiceImpl implements ExamLocationService {
    @Autowired
    ExamLocationMapper examLocationMapper;
    @Override
    public List<ExamLocation> getAllExamLocation() {
        return examLocationMapper.selectAll();
    }

    @Override
    public List<ExamLocation> getDistrictAll(int id) {
        return examLocationMapper.selectDistrictAll(id);
    }

    @Override
    public boolean setExamLocation(ExamLocation examLocation) {
        return examLocationMapper.updateByPrimaryKeySelective(examLocation)>0?true:false;
    }

    @Override
    public boolean addExamLocation(ExamLocation examLocation) {
        return examLocationMapper.insertSelective(examLocation)>0?true:false;
    }

    @Override
    public boolean deleteExamLocation(int id) {
        return examLocationMapper.deleteByPrimaryKey(id)>0?true:false;
    }
}

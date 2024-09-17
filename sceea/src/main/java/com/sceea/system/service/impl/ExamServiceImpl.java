package com.sceea.system.service.impl;

import com.sceea.system.mapper.ExamMapper;
import com.sceea.system.po.Exam;
import com.sceea.system.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamServiceImpl implements ExamService {
    @Autowired
    ExamMapper examMapper;
    @Override
    public Exam getExam(int id) {
        return examMapper.selectByPrimaryKey(id);
    }
}

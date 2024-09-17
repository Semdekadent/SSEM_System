package com.sceea.system.service.impl;


import com.sceea.system.bo.ExamInfoList;
import com.sceea.system.mapper.ExamInfoMapper;
import com.sceea.system.mapper.ExamMapper;
import com.sceea.system.mapper.KaociMapper;
import com.sceea.system.po.ExamInfo;
import com.sceea.system.service.PrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrintServiceImpl implements PrintService {
    @Autowired
    ExamInfoMapper examInfoMapper;
    @Autowired
    ExamMapper examMapper;
    @Autowired
    KaociMapper kaociMapper;
    @Override
    public List<ExamInfo> printExamroom(int examroomId, int kaociId) {
        return examInfoMapper.selectExamroom(examroomId,kaociId);
    }

    @Override
    public ExamInfoList printExamInfo(int examId,String id) {
        ExamInfoList examInfoList = new ExamInfoList();
        examInfoList.setExam(examMapper.selectByPrimaryKey(examId));
        examInfoList.setExamInfos(examInfoMapper.selectStudentExam(examId,id));
        examInfoList.setKaoci(kaociMapper.selectExamAll(examId));
        return examInfoList;
    }
}

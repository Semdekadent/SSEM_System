package com.sceea.system.service;

import com.sceea.system.bo.ExamInfoList;
import com.sceea.system.po.ExamInfo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PrintService {
    public List<ExamInfo> printExamroom(int examroomId, int kaociId);
    public ExamInfoList printExamInfo(int examId, String id);
}

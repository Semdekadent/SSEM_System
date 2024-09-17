package com.sceea.system.service;

import com.sceea.system.po.Exam;
import org.springframework.stereotype.Service;


@Service
public interface ExamService {
    public Exam getExam(int id);
}

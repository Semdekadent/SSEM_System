package com.sceea.system.bo;

import com.sceea.system.po.Exam;
import com.sceea.system.po.ExamInfo;
import com.sceea.system.po.Kaoci;

import java.util.List;

public class ExamInfoList {
    private List<ExamInfo> examInfos;

    private Exam exam;

    private List<Kaoci> kaoci;

    public List<ExamInfo> getExamInfos() {
        return examInfos;
    }

    public void setExamInfos(List<ExamInfo> examInfos) {
        this.examInfos = examInfos;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public List<Kaoci> getKaoci() {
        return kaoci;
    }

    public void setKaoci(List<Kaoci> kaoci) {
        this.kaoci = kaoci;
    }
}

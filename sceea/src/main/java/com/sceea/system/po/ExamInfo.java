package com.sceea.system.po;

public class ExamInfo {
    private Integer examInfoId;

    private Integer seat;

    private String examineeId;

    private Integer examroomId;

    private Integer kaociId;

    public Integer getExamInfoId() {
        return examInfoId;
    }

    public void setExamInfoId(Integer examInfoId) {
        this.examInfoId = examInfoId;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public String getExamineeId() {
        return examineeId;
    }

    public void setExamineeId(String examineeId) {
        this.examineeId = examineeId;
    }

    public Integer getExamroomId() {
        return examroomId;
    }

    public void setExamroomId(Integer examroomId) {
        this.examroomId = examroomId;
    }

    public Integer getKaociId() {
        return kaociId;
    }

    public void setKaociId(Integer kaociId) {
        this.kaociId = kaociId;
    }
}
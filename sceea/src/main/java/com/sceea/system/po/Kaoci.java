package com.sceea.system.po;

import java.util.Date;

public class Kaoci {
    private Integer kaociId;

    private Integer examId;


    private Integer examTime;

    private Integer course;

    private String examDuration;

    private Date examAssignmentTime;

    private Integer examEquipment;

    private Date recordPrint;

    private Integer fileSize;

    private  String markProject;

    public String getMarkProject() {
        return markProject;
    }

    public void setMarkProject(String markProject) {
        this.markProject = markProject;
    }

    public Integer getExamTime() {
        return examTime;
    }

    public void setExamTime(Integer examTime) {
        this.examTime = examTime;
    }


    public Integer getKaociId() {
        return kaociId;
    }

    public void setKaociId(Integer kaociId) {
        this.kaociId = kaociId;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }


    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public String getExamDuration() {
        return examDuration;
    }

    public void setExamDuration(String examDuration) {
        this.examDuration = examDuration == null ? null : examDuration.trim();
    }

    public Date getExamAssignmentTime() {
        return examAssignmentTime;
    }

    public void setExamAssignmentTime(Date examAssignmentTime) {
        this.examAssignmentTime = examAssignmentTime;
    }

    public Integer getExamEquipment() {
        return examEquipment;
    }

    public void setExamEquipment(Integer examEquipment) {
        this.examEquipment = examEquipment;
    }

    public Date getRecordPrint() {
        return recordPrint;
    }

    public void setRecordPrint(Date recordPrint) {
        this.recordPrint = recordPrint;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }
}
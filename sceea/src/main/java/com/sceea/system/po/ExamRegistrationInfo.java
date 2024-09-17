package com.sceea.system.po;

import java.util.Date;

public class ExamRegistrationInfo {
    private Integer examRgstrId;

    private String id;

    private Integer kaociId;

    private Date rgstrTime;

    private Integer paymentStatus;

    public Integer getExamRgstrId() {
        return examRgstrId;
    }

    public void setExamRgstrId(Integer examRgstrId) {
        this.examRgstrId = examRgstrId;
    }

    public Integer getKaociId() {
        return kaociId;
    }

    public void setKaociId(Integer kaociId) {
        this.kaociId = kaociId;
    }

    public Date getRgstrTime() {
        return rgstrTime;
    }

    public void setRgstrTime(Date rgstrTime) {
        this.rgstrTime = rgstrTime;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
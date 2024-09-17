package com.sceea.system.po;

public class ExamineeAccount {
    private Integer examineeId;

    private String examineeName;

    private String examineeMbNum;

    private String examineePasswd;

    public Integer getExamineeId() {
        return examineeId;
    }

    public void setExamineeId(Integer examineeId) {
        this.examineeId = examineeId;
    }

    public String getExamineeName() {
        return examineeName;
    }

    public void setExamineeName(String examineeName) {
        this.examineeName = examineeName == null ? null : examineeName.trim();
    }

    public String getExamineeMbNum() {
        return examineeMbNum;
    }

    public void setExamineeMbNum(String examineeMbNum) {
        this.examineeMbNum = examineeMbNum == null ? null : examineeMbNum.trim();
    }

    public String getExamineePasswd() {
        return examineePasswd;
    }

    public void setExamineePasswd(String examineePasswd) {
        this.examineePasswd = examineePasswd == null ? null : examineePasswd.trim();
    }
}
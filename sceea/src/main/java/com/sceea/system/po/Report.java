package com.sceea.system.po;

public class Report {
    private Integer reportId;

    private String staff;

    private Integer inspectionNum;

    private String caseRecord;

    private String book;

    private Integer assignmentId;

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff == null ? null : staff.trim();
    }

    public Integer getInspectionNum() {
        return inspectionNum;
    }

    public void setInspectionNum(Integer inspectionNum) {
        this.inspectionNum = inspectionNum;
    }

    public String getCaseRecord() {
        return caseRecord;
    }

    public void setCaseRecord(String caseRecord) {
        this.caseRecord = caseRecord == null ? null : caseRecord.trim();
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book == null ? null : book.trim();
    }

    public Integer getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Integer assignmentId) {
        this.assignmentId = assignmentId;
    }
}
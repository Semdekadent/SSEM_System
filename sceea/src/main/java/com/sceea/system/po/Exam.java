package com.sceea.system.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Repository;

import java.util.Date;

@ApiModel(value = "com.sceea.system.po.Exam", description = "考试")

@Repository
public class Exam {
    @ApiModelProperty(value = "ID，新增时设置为NULL，数据库自动增加")
    private Integer examId;
    @ApiModelProperty(value = "考试开考日期")
    private Date examDate;
    @ApiModelProperty(value = "考试名，如：CET-6")
    private String examName;
    @ApiModelProperty(value = "考试类别，这里只分为统考和省考，0表示统考，1表示省考")
    private Integer examType;
    @ApiModelProperty(value = "考试报名开始时间")
    private Date examRgstSdate;
    @ApiModelProperty(value = "开始报名截止时间（注：规定开始时间与截止时间至少间隔10天，截止时间与开考时间至少间隔30天否则返回false）")
    private Date examRgstEdate;
    @ApiModelProperty(value = "开考科目数量，至少为1门")
    private Integer examNums;

    public Exam() {
    }

    public Exam(Date examDate, String examName, Integer examType, Date examRgstSdate, Date examRgstEdate, Integer examNums) {
        this.examDate = examDate;
        this.examName = examName;
        this.examType = examType;
        this.examRgstSdate = examRgstSdate;
        this.examRgstEdate = examRgstEdate;
        this.examNums = examNums;
    }

    public Exam(Integer examId, Date examDate, String examName, Integer examType, Date examRgstSdate, Date examRgstEdate, Integer examNums) {
        this.examId = examId;
        this.examDate = examDate;
        this.examName = examName;
        this.examType = examType;
        this.examRgstSdate = examRgstSdate;
        this.examRgstEdate = examRgstEdate;
        this.examNums = examNums;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName == null ? null : examName.trim();
    }

    public Integer getExamType() {
        return examType;
    }

    public void setExamType(Integer examType) {
        this.examType = examType;
    }

    public Date getExamRgstSdate() {
        return examRgstSdate;
    }

    public void setExamRgstSdate(Date examRgstSdate) {
        this.examRgstSdate = examRgstSdate;
    }

    public Date getExamRgstEdate() {
        return examRgstEdate;
    }

    public void setExamRgstEdate(Date examRgstEdate) {
        this.examRgstEdate = examRgstEdate;
    }

    public Integer getExamNums() {
        return examNums;
    }

    public void setExamNums(Integer examNums) {
        this.examNums = examNums;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examId=" + examId +
                ", examDate=" + examDate +
                ", examName='" + examName + '\'' +
                ", examType=" + examType +
                ", examRgstSdate=" + examRgstSdate +
                ", examRgstEdate=" + examRgstEdate +
                ", examNums=" + examNums +
                '}';
    }
}
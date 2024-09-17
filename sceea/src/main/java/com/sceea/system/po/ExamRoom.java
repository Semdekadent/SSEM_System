package com.sceea.system.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "com.sceea.system.po.ExamRoom",description = "考场")
public class ExamRoom {
    @ApiModelProperty(value = "考场编号，新增时设置为NULL，数据库自动增加")
    private Integer examroomId;
    @ApiModelProperty(value = "考场名称")
    private String examroomName;
    @ApiModelProperty(value = "所属考点编号")
    private Integer locationCode;
    @ApiModelProperty(value = "考场类型")
    private Integer classroomType;
    @ApiModelProperty(value = "考场容量")
    private Integer capability;

    public Integer getExamroomId() {
        return examroomId;
    }

    public void setExamroomId(Integer examroomId) {
        this.examroomId = examroomId;
    }

    public String getExamroomName() {
        return examroomName;
    }

    public void setExamroomName(String examroomName) {
        this.examroomName = examroomName == null ? null : examroomName.trim();
    }

    public Integer getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(Integer locationCode) {
        this.locationCode = locationCode;
    }

    public Integer getClassroomType() {
        return classroomType;
    }

    public void setClassroomType(Integer classroomType) {
        this.classroomType = classroomType;
    }

    public Integer getCapability() {
        return capability;
    }

    public void setCapability(Integer capability) {
        this.capability = capability;
    }
}
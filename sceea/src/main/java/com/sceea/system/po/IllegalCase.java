package com.sceea.system.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "com.sceea.system.po.IllegalCase", description = "违规上报")
public class IllegalCase {
    @ApiModelProperty(value = "ID，新增时设置为NULL，数据库自动增加")
    private Integer caseId;
    @ApiModelProperty(value = "描述，上报的详情描述")
    private String caseDescription;
    @ApiModelProperty(value = "违规编码")
    private Integer illegalId;
    @ApiModelProperty(value = "处罚编码")
    private Integer punishmentId;
    @ApiModelProperty(value = "考次考场ID")
    private Integer assignmentId;
    @ApiModelProperty(value = "考生学籍ID")
    private Integer infoId;

    public Integer getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Integer assignmentId) {
        this.assignmentId = assignmentId;
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }


    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getCaseDescription() {
        return caseDescription;
    }

    public void setCaseDescription(String caseDescription) {
        this.caseDescription = caseDescription == null ? null : caseDescription.trim();
    }

    public Integer getIllegalId() {
        return illegalId;
    }

    public void setIllegalId(Integer illegalId) {
        this.illegalId = illegalId;
    }

    public Integer getPunishmentId() {
        return punishmentId;
    }

    public void setPunishmentId(Integer punishmentId) {
        this.punishmentId = punishmentId;
    }
}
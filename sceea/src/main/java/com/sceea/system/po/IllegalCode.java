package com.sceea.system.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "com.sceea.system.po.IllegalCode",description = "违规编码")
public class IllegalCode {
    @ApiModelProperty(value = "ID，新增时设置为NULL，数据库自动增加")
    private Integer illegalId;
    @ApiModelProperty(value = "违规名")
    private String illegalName;
    @ApiModelProperty(value = "违规编码值")
    private Integer illegCode;

    public Integer getIllegalId() {
        return illegalId;
    }

    public void setIllegalId(Integer illegalId) {
        this.illegalId = illegalId;
    }

    public String getIllegalName() {
        return illegalName;
    }

    public void setIllegalName(String illegalName) {
        this.illegalName = illegalName == null ? null : illegalName.trim();
    }

    public Integer getIllegCode() {
        return illegCode;
    }

    public void setIllegCode(Integer illegCode) {
        this.illegCode = illegCode;
    }
}
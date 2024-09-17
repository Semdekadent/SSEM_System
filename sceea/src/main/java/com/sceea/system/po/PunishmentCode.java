package com.sceea.system.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "com.sceea.system.po.PunishmentCode", description = "处罚编码")
public class PunishmentCode {
    @ApiModelProperty(value = "ID，新增时设置为NULL，数据库自动增加")
    private Integer punishmentId;
    @ApiModelProperty(value = "处罚名")
    private String punishmentName;
    @ApiModelProperty(value = "处罚编码值")
    private Integer punishCode;

    public PunishmentCode(Integer punishmentId, String punishmentName, Integer punishCode) {
        this.punishmentId = punishmentId;
        this.punishmentName = punishmentName;
        this.punishCode = punishCode;
    }

    public Integer getPunishmentId() {
        return punishmentId;
    }

    public void setPunishmentId(Integer punishmentId) {
        this.punishmentId = punishmentId;
    }

    public String getPunishmentName() {
        return punishmentName;
    }

    public void setPunishmentName(String punishmentName) {
        this.punishmentName = punishmentName == null ? null : punishmentName.trim();
    }

    public Integer getPunishCode() {
        return punishCode;
    }

    public void setPunishCode(Integer punishCode) {
        this.punishCode = punishCode;
    }
}
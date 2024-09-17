package com.sceea.system.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "com.sceea.system.po.MarkInstitutions",description = "评卷院校")
public class MarkInstitutions {
    @ApiModelProperty(value = "评卷编号，新增时设置为NULL，数据库自动增加")
    private Integer markInstitutionsId;
    @ApiModelProperty(value = "评卷学校")
    private Integer collegeId;
    @ApiModelProperty(value = "被评考次")
    private Integer kaociId;

    public Integer getMarkInstitutionsId() {
        return markInstitutionsId;
    }

    public void setMarkInstitutionsId(Integer markInstitutionsId) {
        this.markInstitutionsId = markInstitutionsId;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public Integer getKaociId() {
        return kaociId;
    }

    public void setKaociId(Integer kaociId) {
        this.kaociId = kaociId;
    }
}
package com.sceea.system.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "com.sceea.system.po.ExamLocation",description = "考点")
public class ExamLocation {
    @ApiModelProperty(value = "考点编号")
    private Integer locationCode;
    @ApiModelProperty(value = "考点名称")
    private String locationName;
    @ApiModelProperty(value = "考点所属区县")
    private Integer districtId;

    public Integer getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(Integer locationCode) {
        this.locationCode = locationCode;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName == null ? null : locationName.trim();
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }
}
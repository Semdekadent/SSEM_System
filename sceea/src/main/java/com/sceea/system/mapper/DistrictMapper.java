package com.sceea.system.mapper;

import com.sceea.system.po.District;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictMapper {
    int deleteByPrimaryKey(Integer districtId);

    int insert(District record);

    int insertSelective(District record);

    District selectByPrimaryKey(Integer districtId);

    int updateByPrimaryKeySelective(District record);

    int updateByPrimaryKey(District record);
}
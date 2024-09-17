package com.sceea.system.mapper;

import com.sceea.system.po.MarkInstitutions;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MarkInstitutionsMapper {
    int deleteByPrimaryKey(Integer markInstitutionsId);

    int insert(MarkInstitutions record);

    int insertSelective(MarkInstitutions record);

    List<MarkInstitutions> selectKaociAll(Integer kaociId);

    MarkInstitutions selectByPrimaryKey(Integer markInstitutionsId);

    int updateByPrimaryKeySelective(MarkInstitutions record);

    int updateByPrimaryKey(MarkInstitutions record);
}
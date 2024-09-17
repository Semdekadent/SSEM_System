package com.sceea.system.mapper;

import com.sceea.system.po.CollegeMajor;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeMajorMapper {
    int deleteByPrimaryKey(Integer majorId);

    int insert(CollegeMajor record);

    int insertSelective(CollegeMajor record);

    CollegeMajor selectByPrimaryKey(Integer majorId);

    int updateByPrimaryKeySelective(CollegeMajor record);

    int updateByPrimaryKey(CollegeMajor record);
}
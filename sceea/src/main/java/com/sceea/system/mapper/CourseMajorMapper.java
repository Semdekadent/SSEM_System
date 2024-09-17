package com.sceea.system.mapper;

import com.sceea.system.po.CourseMajor;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMajorMapper {
    int deleteByPrimaryKey(Integer courseMajorId);

    int insert(CourseMajor record);

    int insertSelective(CourseMajor record);

    CourseMajor selectByPrimaryKey(Integer courseMajorId);

    int updateByPrimaryKeySelective(CourseMajor record);

    int updateByPrimaryKey(CourseMajor record);
}
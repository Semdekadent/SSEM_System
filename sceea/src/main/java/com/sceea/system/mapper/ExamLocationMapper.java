package com.sceea.system.mapper;

import com.sceea.system.po.ExamLocation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface ExamLocationMapper {
    int deleteByPrimaryKey(Integer locationCode);

    int insert(ExamLocation record);

    int insertSelective(ExamLocation record);

    List<ExamLocation> selectAll();

    List<ExamLocation> selectDistrictAll(Integer districtId);

    ExamLocation selectByPrimaryKey(Integer locationCode);

    int updateByPrimaryKeySelective(ExamLocation record);

    int updateByPrimaryKey(ExamLocation record);
}
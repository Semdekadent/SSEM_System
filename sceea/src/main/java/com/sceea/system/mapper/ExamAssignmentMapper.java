package com.sceea.system.mapper;

import com.sceea.system.po.ExamAssignment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface ExamAssignmentMapper {
    int deleteByPrimaryKey(Integer assignmentId);

    int insert(ExamAssignment record);

    int insertSelective(ExamAssignment record);

    ExamAssignment selectByPrimaryKey(Integer assignmentId);

    List<ExamAssignment> selectDistrict(Integer districtId,Integer kaociId);

    int updateByPrimaryKeySelective(ExamAssignment record);

    int updateByPrimaryKey(ExamAssignment record);
}
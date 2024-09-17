package com.sceea.system.mapper;

import com.sceea.system.po.ExamInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface ExamInfoMapper {
    int deleteByPrimaryKey(Integer examInfoId);

    List<ExamInfo> selectDistrict(int districtId, int kaociId);

    List<ExamInfo> selectExamroom(int examroomId,int kaociId);

    List<ExamInfo> selectStudentExam(@Param("examId")int examId, @Param("id")String id);

    int insert(ExamInfo record);

    int insertSelective(ExamInfo record);

    ExamInfo selectByPrimaryKey(Integer examInfoId);

    int updateByPrimaryKeySelective(ExamInfo record);

    int updateByPrimaryKey(ExamInfo record);
}
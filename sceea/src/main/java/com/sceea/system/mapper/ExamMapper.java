package com.sceea.system.mapper;

import com.sceea.system.po.Exam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExamMapper {
    int deleteByPrimaryKey(Integer examId);

    int insert(Exam record);

    int insertSelective(Exam record);

    Exam selectByPrimaryKey(Integer examId);

    List<Exam> selectAll();

    Exam selectByName(String examName);

    int updateByPrimaryKeySelective(Exam record);

    int updateByPrimaryKey(Exam record);
}
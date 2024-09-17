package com.sceea.system.mapper;

import com.sceea.system.po.Exam;
import com.sceea.system.po.ExamLocation;
import com.sceea.system.po.ExamRoom;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface ExamRoomMapper {
    int deleteByPrimaryKey(Integer examroomId);

    int insert(ExamRoom record);

    int insertSelective(ExamRoom record);

    List<ExamRoom> selectAll();

    List<ExamRoom> selectDistrictAll(int districtId,int examSeq);

    List<ExamRoom> selectExamLocationAll(Integer locationCode);

    ExamRoom selectByPrimaryKey(Integer examroomId);

    int updateByPrimaryKeySelective(ExamRoom record);

    int updateByPrimaryKey(ExamRoom record);
}
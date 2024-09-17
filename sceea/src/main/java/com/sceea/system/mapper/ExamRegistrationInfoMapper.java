package com.sceea.system.mapper;

import com.sceea.system.po.ExamRegistrationInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface ExamRegistrationInfoMapper {
    int deleteByPrimaryKey(Integer examRgstrId);

    int insert(ExamRegistrationInfo record);

    int insertSelective(ExamRegistrationInfo record);

    List<ExamRegistrationInfo> selectKaociExamRegistrationInfo(Integer kaociId);

    List<ExamRegistrationInfo> selectDistrictExamRegistrationInfo(Integer districtId,Integer kaociId);

    ExamRegistrationInfo selectByPrimaryKey(Integer examRgstrId);

    int updateByPrimaryKeySelective(ExamRegistrationInfo record);

    int updateByPrimaryKeyWithBLOBs(ExamRegistrationInfo record);

    int updateByPrimaryKey(ExamRegistrationInfo record);
}
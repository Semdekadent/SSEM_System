package com.sceea.system.mapper;

import com.sceea.system.po.Kaoci;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KaociMapper {
    int deleteByPrimaryKey(Integer kaociId);

    int insert(Kaoci record);

    int insertSelective(Kaoci record);

    List<Kaoci> selectExamAll(Integer examId);

    Kaoci selectByPrimaryKey(Integer kaociId);

    int setMarkProject(Integer kaociId,String markProject);

    int updateByPrimaryKeySelective(Kaoci record);

    int updateByPrimaryKey(Kaoci record);
}
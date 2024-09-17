package com.sceea.system.mapper;

import com.sceea.system.po.IllegalCase;
import com.sceea.system.po.IllegalCode;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface IllegalCaseMapper {
    int deleteByPrimaryKey(Integer caseId);

    int insert(IllegalCase record);

    int insertSelective(IllegalCase record);

    List<IllegalCase> selectAll();

    List<IllegalCase> selectKey(String word);

    IllegalCase selectByPrimaryKey(Integer caseId);

    int updateByPrimaryKeySelective(IllegalCase record);

    int updateByPrimaryKey(IllegalCase record);
}
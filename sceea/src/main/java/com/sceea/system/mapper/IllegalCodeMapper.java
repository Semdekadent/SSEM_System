package com.sceea.system.mapper;

import com.sceea.system.po.IllegalCode;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface IllegalCodeMapper {
    int deleteByPrimaryKey(Integer illegalId);

    int insert(IllegalCode record);

    int insertSelective(IllegalCode record);

    List<IllegalCode> selectALL();

    IllegalCode selectByPrimaryKey(Integer illegalId);

    int updateByPrimaryKeySelective(IllegalCode record);

    int updateByPrimaryKey(IllegalCode record);
}
package com.sceea.system.mapper;

import com.sceea.system.po.ExamineeAccount;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamineeAccountMapper {
    int deleteByPrimaryKey(Integer examineeId);

    int insert(ExamineeAccount record);

    int insertSelective(ExamineeAccount record);

    ExamineeAccount selectByPrimaryKey(Integer examineeId);

    int updateByPrimaryKeySelective(ExamineeAccount record);

    int updateByPrimaryKey(ExamineeAccount record);
}
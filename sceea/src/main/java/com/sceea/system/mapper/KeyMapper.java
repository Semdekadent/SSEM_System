package com.sceea.system.mapper;

import com.sceea.system.po.Key;
import org.springframework.stereotype.Repository;

@Repository
public interface KeyMapper {
    int deleteByPrimaryKey(Integer keyId);

    int insert(Key record);

    int insertSelective(Key record);

    Key selectByPrimaryKey(Integer keyId);

    int updateByPrimaryKeySelective(Key record);

    int updateByPrimaryKey(Key record);
}
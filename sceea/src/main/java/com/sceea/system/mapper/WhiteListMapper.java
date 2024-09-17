package com.sceea.system.mapper;

import com.sceea.system.po.WhiteList;
import org.springframework.stereotype.Repository;

@Repository
public interface WhiteListMapper {
    int deleteByPrimaryKey(Integer whiteListId);

    int insert(WhiteList record);

    int insertSelective(WhiteList record);

    WhiteList selectByPrimaryKey(Integer whiteListId);

    int updateByPrimaryKeySelective(WhiteList record);

    int updateByPrimaryKey(WhiteList record);
}
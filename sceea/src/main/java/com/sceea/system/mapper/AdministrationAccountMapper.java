package com.sceea.system.mapper;

import com.sceea.system.po.AdministrationAccount;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministrationAccountMapper {
    int deleteByPrimaryKey(Integer adminAccountId);

    int insert(AdministrationAccount record);

    int insertSelective(AdministrationAccount record);

    AdministrationAccount selectByPrimaryKey(Integer adminAccountId);

    int updateByPrimaryKeySelective(AdministrationAccount record);

    int updateByPrimaryKey(AdministrationAccount record);
}
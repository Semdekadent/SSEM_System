package com.sceea.system.mapper;

import com.sceea.system.po.AffiliationAccount;
import org.springframework.stereotype.Repository;

@Repository
public interface AffiliationAccountMapper {
    int deleteByPrimaryKey(Integer affiliationId);

    int insert(AffiliationAccount record);

    int insertSelective(AffiliationAccount record);

    AffiliationAccount selectByPrimaryKey(Integer affiliationId);

    int updateByPrimaryKeySelective(AffiliationAccount record);

    int updateByPrimaryKeyWithBLOBs(AffiliationAccount record);

    int updateByPrimaryKey(AffiliationAccount record);
}
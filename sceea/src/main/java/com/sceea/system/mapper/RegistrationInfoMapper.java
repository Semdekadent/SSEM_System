package com.sceea.system.mapper;

import com.sceea.system.po.RegistrationInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationInfoMapper {
    int deleteByPrimaryKey(Integer infoId);

    int insert(RegistrationInfo record);

    int insertSelective(RegistrationInfo record);

    RegistrationInfo selectByPrimaryKey(Integer infoId);

    int updateByPrimaryKeySelective(RegistrationInfo record);

    int updateByPrimaryKeyWithBLOBs(RegistrationInfo record);

    int updateByPrimaryKey(RegistrationInfo record);
}
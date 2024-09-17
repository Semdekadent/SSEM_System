package com.sceea.system.mapper;

import com.sceea.system.po.PunishmentCode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PunishmentCodeMapper {
    int deleteByPrimaryKey(Integer punishmentId);

    int insert(PunishmentCode record);

    int insertSelective(PunishmentCode record);

    List<PunishmentCode> selectALL();

    PunishmentCode selectByPrimaryKey(Integer punishmentId);

    int updateByPrimaryKeySelective(PunishmentCode record);

    int updateByPrimaryKey(PunishmentCode record);
}
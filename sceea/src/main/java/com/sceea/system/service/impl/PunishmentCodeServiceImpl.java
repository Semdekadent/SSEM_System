package com.sceea.system.service.impl;

import com.sceea.system.mapper.PunishmentCodeMapper;
import com.sceea.system.po.PunishmentCode;
import com.sceea.system.service.PunishmentCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PunishmentCodeServiceImpl implements PunishmentCodeService {
    @Autowired
    private PunishmentCodeMapper punishmentCodeMapper;

    @Override
    public List<PunishmentCode> getAllPunishmentCode() {
        return punishmentCodeMapper.selectALL();
    }

    @Override
    public boolean setPunishmentCode(PunishmentCode punishmentCode) {
        return punishmentCodeMapper.updateByPrimaryKeySelective(punishmentCode)>0?true:false;
    }

    @Override
    public boolean addPunishmentCode(PunishmentCode punishmentCode) {
        return punishmentCodeMapper.insertSelective(punishmentCode)>0?true:false;
    }

    @Override
    public boolean deletePunishmentCode(int id) {
        return punishmentCodeMapper.deleteByPrimaryKey(id)>0?true:false;
    }
}

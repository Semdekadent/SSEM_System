package com.sceea.system.service;

import com.sceea.system.po.PunishmentCode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PunishmentCodeService {
    public List<PunishmentCode> getAllPunishmentCode();
    public boolean setPunishmentCode(PunishmentCode punishmentCode);
    public boolean addPunishmentCode(PunishmentCode punishmentCode);
    public boolean deletePunishmentCode(int id);
}

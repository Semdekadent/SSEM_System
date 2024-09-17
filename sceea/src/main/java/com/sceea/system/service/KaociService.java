package com.sceea.system.service;

import com.sceea.system.po.Kaoci;
import org.springframework.stereotype.Service;

@Service
public interface KaociService {
    public boolean setMarkProject(int id,String address);
    public boolean setArrangement(Kaoci kaoci);
}

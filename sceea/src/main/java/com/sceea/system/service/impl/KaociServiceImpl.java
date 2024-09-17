package com.sceea.system.service.impl;

import com.sceea.system.mapper.ExamInfoMapper;
import com.sceea.system.mapper.KaociMapper;
import com.sceea.system.po.Kaoci;
import com.sceea.system.service.KaociService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KaociServiceImpl implements KaociService {
    @Autowired
    KaociMapper kaociMapper;

    @Override
    public boolean setMarkProject(int id, String address) {
        return kaociMapper.setMarkProject(id,address)>0?true:false;
    }

    @Override
    public boolean setArrangement(Kaoci kaoci) {
        return kaociMapper.updateByPrimaryKeySelective(kaoci)>0?true:false;
    }
}

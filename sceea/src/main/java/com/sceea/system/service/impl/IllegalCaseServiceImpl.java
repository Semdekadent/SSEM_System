package com.sceea.system.service.impl;

import com.sceea.system.mapper.IllegalCaseMapper;
import com.sceea.system.po.IllegalCase;
import com.sceea.system.service.IllegalCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IllegalCaseServiceImpl implements IllegalCaseService {
    @Autowired
    IllegalCaseMapper illegalCaseMapper;
    @Override
    public List<IllegalCase> getAllIllegalCase() {
        return illegalCaseMapper.selectAll();
    }

    @Override
    public List<IllegalCase> getKeyIllegalCase(String word) {
        return illegalCaseMapper.selectKey(word);
    }

    @Override
    public boolean setIllegalCase(IllegalCase illegalCase) {
        return illegalCaseMapper.updateByPrimaryKeySelective(illegalCase)>0?true:false;
    }

    @Override
    public boolean addIllegalCase(IllegalCase illegalCase) {
        return illegalCaseMapper.insertSelective(illegalCase)>0?true:false;
    }

    @Override
    public boolean deleteIllegalCase(int id) {
        return illegalCaseMapper.deleteByPrimaryKey(id)>0?true:false;
    }
}

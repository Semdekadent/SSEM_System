package com.sceea.system.service.impl;

import com.sceea.system.mapper.IllegalCodeMapper;
import com.sceea.system.po.IllegalCode;
import com.sceea.system.service.IllegalCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IllegalCodeServiceImpl implements IllegalCodeService {
    @Autowired
    IllegalCodeMapper illegalCodeMapper;
    @Override
    public List<IllegalCode> getAllIllegalCode() {
        return illegalCodeMapper.selectALL();
    }

    @Override
    public boolean setIllegalCode(IllegalCode illegalCode) {
        return illegalCodeMapper.updateByPrimaryKeySelective(illegalCode)>0?true:false;
    }

    @Override
    public boolean addIllegalCode(IllegalCode illegalCode) {
        return illegalCodeMapper.insertSelective(illegalCode)>0?true:false;
    }

    @Override
    public boolean deleteIllegalCode(int id) {
        return illegalCodeMapper.deleteByPrimaryKey(id)>0?true:false;
    }
}

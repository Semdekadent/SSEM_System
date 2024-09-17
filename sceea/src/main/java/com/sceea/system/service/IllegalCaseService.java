package com.sceea.system.service;


import com.sceea.system.po.IllegalCase;
import com.sceea.system.po.IllegalCode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IllegalCaseService {
    public List<IllegalCase> getAllIllegalCase();
    public List<IllegalCase> getKeyIllegalCase(String word);
    public boolean setIllegalCase(IllegalCase illegalCase);
    public boolean addIllegalCase(IllegalCase illegalCase);
    public boolean deleteIllegalCase(int id);
}

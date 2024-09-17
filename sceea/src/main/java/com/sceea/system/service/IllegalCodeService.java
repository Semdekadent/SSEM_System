package com.sceea.system.service;


import com.sceea.system.po.IllegalCode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IllegalCodeService {
    public List<IllegalCode> getAllIllegalCode();
    public boolean setIllegalCode(IllegalCode illegalCode);
    public boolean addIllegalCode(IllegalCode illegalCode);
    public boolean deleteIllegalCode(int id);
}

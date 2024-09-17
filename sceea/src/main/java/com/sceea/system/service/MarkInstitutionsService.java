package com.sceea.system.service;

import com.sceea.system.po.College;
import com.sceea.system.po.MarkInstitutions;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MarkInstitutionsService {
    public List<MarkInstitutions> getKaociAll(int id);
    public List<College> getLeftAll(int id);
    public boolean addMarkInstitutions(MarkInstitutions markInstitutions);
    public boolean deleteMarkInstitutions(int id);
}

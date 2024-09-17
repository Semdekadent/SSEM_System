package com.sceea.system.service.impl;

import com.sceea.system.mapper.CollegeMapper;
import com.sceea.system.mapper.MarkInstitutionsMapper;
import com.sceea.system.po.College;
import com.sceea.system.po.MarkInstitutions;
import com.sceea.system.service.MarkInstitutionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MarkInstitutionsServiceImpl implements MarkInstitutionsService {
    @Autowired
    MarkInstitutionsMapper markInstitutionsMapper;
    @Autowired
    CollegeMapper collegeMapper;

    @Override
    public List<MarkInstitutions> getKaociAll(int id) {
        return markInstitutionsMapper.selectKaociAll(id);
    }

    @Override
    public List<College> getLeftAll(int id) {
        List<College> colleges = collegeMapper.selectAll();
        List<MarkInstitutions> markInstitutions = markInstitutionsMapper.selectKaociAll(id);
        List<College> left = new ArrayList<College>();
        for(College college:colleges){
            boolean flag = true;
            for(MarkInstitutions markInstitution:markInstitutions){
                if(college.getCollegeId()==markInstitution.getCollegeId())
                    flag = false;
            }
            if(flag)
                left.add(college);
        }
        return left;
    }

    @Override
    public boolean addMarkInstitutions(MarkInstitutions markInstitutions) {
        return markInstitutionsMapper.insert(markInstitutions)>0?true:false;
    }

    @Override
    public boolean deleteMarkInstitutions(int id) {
        return markInstitutionsMapper.deleteByPrimaryKey(id)>0?true:false;
    }
}

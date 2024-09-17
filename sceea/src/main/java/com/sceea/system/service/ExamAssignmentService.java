package com.sceea.system.service;

import com.sceea.system.po.ExamAssignment;
import com.sceea.system.po.ExamRoom;
import com.sceea.system.po.Kaoci;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExamAssignmentService {
    public List<ExamAssignment> selectDistrictExamAssignment(int districtId,int kaociId);
    public List<ExamRoom> selectLeftExamRoom(int districtId, int examTime);
    public boolean addExamAssignment(ExamAssignment examAssignment);
    public boolean deleteExamAssignment(int examAssignment_id);
    public boolean save(int districtId,int kaociId);
}

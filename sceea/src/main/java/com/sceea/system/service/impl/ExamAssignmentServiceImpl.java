package com.sceea.system.service.impl;

import com.sceea.system.mapper.ExamAssignmentMapper;
import com.sceea.system.mapper.ExamInfoMapper;
import com.sceea.system.mapper.ExamRegistrationInfoMapper;
import com.sceea.system.mapper.ExamRoomMapper;
import com.sceea.system.po.*;
import com.sceea.system.service.ExamAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExamAssignmentServiceImpl implements ExamAssignmentService {
    @Autowired
    ExamAssignmentMapper examAssignmentMapper;
    @Autowired
    ExamRoomMapper examRoomMapper;
    @Autowired
    ExamRegistrationInfoMapper examRegistrationInfoMapper;
    @Autowired
    ExamInfoMapper examInfoMapper;

    @Override
    public List<ExamAssignment> selectDistrictExamAssignment(int districtId,int kaociId) {
        return examAssignmentMapper.selectDistrict(districtId,kaociId);
    }

    @Override
    public List<ExamRoom> selectLeftExamRoom(int districtId, int examTime) {
        return examRoomMapper.selectDistrictAll(districtId,examTime);
    }

    @Override
    public boolean addExamAssignment(ExamAssignment examAssignment) {
        return examAssignmentMapper.insertSelective(examAssignment)>0?true:false;
    }

    @Override
    public boolean deleteExamAssignment(int examAssignment_id) {
        return examAssignmentMapper.deleteByPrimaryKey(examAssignment_id)>0?true:false;
    }

    @Override
    public boolean save(int districtId, int kaociId) {
        List<ExamInfo> examInfos = examInfoMapper.selectDistrict(districtId,kaociId);
        for(ExamInfo examInfo:examInfos){
            examInfoMapper.deleteByPrimaryKey(examInfo.getExamInfoId());
        }

        List<ExamAssignment> examAssignments = examAssignmentMapper.selectDistrict(districtId,kaociId);
        List<ExamRegistrationInfo>  examRegistrationInfos = examRegistrationInfoMapper.selectDistrictExamRegistrationInfo(districtId,kaociId);
        int num = 1;
        int j = 0;
        ExamInfo examInfo = new ExamInfo();
        int size = examRoomMapper.selectByPrimaryKey(examAssignments.get(j).getExamroomId()).getCapability();
        for(int i = 0;i < examRegistrationInfos.size();i++){
            if(num > size){
                num = 1;
                j += 1;
                size = examRoomMapper.selectByPrimaryKey(examAssignments.get(j).getExamroomId()).getCapability();
            }
            examInfo.setExamineeId(examRegistrationInfos.get(i).getId());/*String id = */
            examInfo.setSeat(num); /*int seat = */
            examInfo.setExamroomId(examAssignments.get(j).getExamroomId());/*int examroom_id =*/
            examInfo.setKaociId(examRegistrationInfos.get(i).getKaociId());/*int kaoci_id = */
            examInfoMapper.insertSelective(examInfo);
            num += 1;
        }
        return true;
    }

}

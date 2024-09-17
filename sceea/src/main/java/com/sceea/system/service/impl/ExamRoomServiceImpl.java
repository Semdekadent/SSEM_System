package com.sceea.system.service.impl;

import com.sceea.system.mapper.ExamRoomMapper;
import com.sceea.system.po.ExamRoom;
import com.sceea.system.service.ExamRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExamRoomServiceImpl implements ExamRoomService {
    @Autowired
    ExamRoomMapper examRoomMapper;
    @Override
    public List<ExamRoom> getAllExamRoom() {
        return examRoomMapper.selectAll();
    }

    @Override
    public List<ExamRoom> getExamLocationAll(int id) {
        return examRoomMapper.selectExamLocationAll(id);
    }

    @Override
    public boolean setExamRoom(ExamRoom examRoom) {
        return examRoomMapper.updateByPrimaryKeySelective(examRoom)>0?true:false;
    }

    @Override
    public boolean addExamRoom(ExamRoom examRoom) {
        return examRoomMapper.insertSelective(examRoom)>0?true:false;
    }

    @Override
    public boolean deleteExamRoom(int id) {
        return examRoomMapper.deleteByPrimaryKey(id)>0?true:false;
    }

}

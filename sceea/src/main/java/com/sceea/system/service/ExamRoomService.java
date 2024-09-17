package com.sceea.system.service;

import com.sceea.system.po.ExamRoom;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ExamRoomService {
    public List<ExamRoom> getAllExamRoom();
    public List<ExamRoom> getExamLocationAll(int id);
    public boolean setExamRoom(ExamRoom examRoom);
    public boolean addExamRoom(ExamRoom examRoom);
    public boolean deleteExamRoom(int id);
}

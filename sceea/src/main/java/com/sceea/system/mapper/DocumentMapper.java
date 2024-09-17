package com.sceea.system.mapper;

import com.sceea.system.po.Document;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface DocumentMapper {
    int deleteByPrimaryKey(Integer docId);

    int insert(Document record);

    int insertSelective(Document record);

    List<Document> selectAll();

    Document selectByPrimaryKey(Integer docId);

    int updateByPrimaryKeySelective(Document record);

    int updateByPrimaryKey(Document record);
}
package com.sceea.system.service.impl;

import com.sceea.system.mapper.DocumentMapper;
import com.sceea.system.po.Document;
import com.sceea.system.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    DocumentMapper documentMapper;
    @Override
    public List<Document> getAllDocument() {
        return documentMapper.selectAll();
    }

    @Override
    public Document getDocument(int id) {
        return documentMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean addDocument(Document document) {
        return documentMapper.insert(document)>0?true:false;
    }

    @Override
    public boolean deleteDocument(int id) {
        return documentMapper.deleteByPrimaryKey(id)>0?true:false;
    }
}

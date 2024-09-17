package com.sceea.system.service;

import com.sceea.system.po.Document;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DocumentService {
    public List<Document> getAllDocument();
    public Document getDocument(int id);
    public boolean addDocument(Document document);
    public boolean deleteDocument(int id);
}

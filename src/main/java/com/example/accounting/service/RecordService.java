package com.example.accounting.service;

import com.example.accounting.entity.Record;
import com.example.accounting.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    public Record addRecord(Record record) {
        record.setDate(LocalDateTime.now());
        return recordRepository.save(record);
    }


    public List<Record> getAllRecords() {
        return recordRepository.findAll();
    }

    public void deleteByID(Long id) {
         recordRepository.deleteById(id);
    }
}
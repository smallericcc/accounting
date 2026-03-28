package com.example.accounting.controller;

import com.example.accounting.entity.Record;
import com.example.accounting.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/records")
public class RecordController {

    @Autowired
    private RecordService recordService;

    // 新增记账
    @PostMapping
    public Record addRecord(@RequestBody Record record) {
        return recordService.addRecord(record);
    }


    @RequestMapping(value = "test")
    public String recordTest(){
        return "成功！";
    }

    @GetMapping
    public List<Record> getAllRecords() {
        return recordService.getAllRecords();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        recordService.deleteByID(id);
    }
}
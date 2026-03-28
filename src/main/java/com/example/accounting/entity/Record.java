package com.example.accounting.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 金额
    private Double amount;

    // 类型：INCOME / EXPENSE
    private String type;

    // 分类：餐饮、交通等
    private String category;

    // 备注
    private String note;

    // 时间
    private LocalDateTime date;
}
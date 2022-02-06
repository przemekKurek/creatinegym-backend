package com.example.bd2.model.DTO;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ReportDTO {

    private String productName;
    private Long amount;
    private BigDecimal price;
    private BigDecimal sum;
    private BigDecimal gain;
}

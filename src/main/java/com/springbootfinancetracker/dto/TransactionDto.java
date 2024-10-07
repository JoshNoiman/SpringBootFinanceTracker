package com.springbootfinancetracker.dto;

import lombok.Data;

@Data
public class TransactionDto {
    private Integer transactionID;
    private Integer amount;
    private String category;
    private Integer date;
}

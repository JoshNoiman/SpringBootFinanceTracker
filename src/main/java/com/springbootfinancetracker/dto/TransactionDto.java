package com.springbootfinancetracker.dto;

import lombok.Data;

@Data
public class TransactionDto {
    private Integer transactionID;
    private String categroyIsIncomeOrExpense;
    private String transactionName;
}

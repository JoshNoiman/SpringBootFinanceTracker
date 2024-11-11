package com.springbootfinancetracker.dto;

import lombok.Data;

@Data
public class TransactionDto {
    private Integer transactionID;
    private String categoryIsIncomeOrExpense;
    private String transactionName;
    private Integer transactionValue;
}

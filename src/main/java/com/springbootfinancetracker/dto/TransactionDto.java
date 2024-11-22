package com.springbootfinancetracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto {
    private Integer transactionID;
    private String categroyIsIncomeOrExpense;
    private String transactionName;
    private Double incomeAmount;
    private Double expenseAmount;
    private Double amount;
    private String transactionCategory;
}

package com.springbootfinancetracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto {
    private Integer transactionID;
    private String categoryIsIncomeOrExpense;
    private String transactionName;
<<<<<<< HEAD
    private Double incomeAmount;
    private Double expenseAmount;
    private Double amount;
    private String transactionCategory;
=======
    private Integer transactionValue;
>>>>>>> 09e324caf95c428b9b8e4775d62e9172ec1c249c
}

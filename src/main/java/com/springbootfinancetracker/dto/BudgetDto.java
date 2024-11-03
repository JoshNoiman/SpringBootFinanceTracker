package com.springbootfinancetracker.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BudgetDto {
    private Integer budgetID;
    private String category;
    private BigDecimal amount = BigDecimal.ZERO;
}

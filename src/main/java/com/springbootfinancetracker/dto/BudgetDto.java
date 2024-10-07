package com.springbootfinancetracker.dto;

import lombok.Data;

@Data
public class BudgetDto {
    private Integer budgetID;
    private String category;
    private Integer amount;
}

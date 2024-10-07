package com.springbootfinancetracker.dto;

import lombok.Data;

@Data
public class FinancialGoalDto {
    private Integer goalID;
    private Integer targetamount;
    private Integer currentAmount;
    private Integer dueDate;
}

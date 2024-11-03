package com.springbootfinancetracker.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class FinancialGoalDto {
    private Integer goalID;
    private BigDecimal targetAmount = BigDecimal.ZERO;
    private String goalName;
    private LocalDate targetDate;

}

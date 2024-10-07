package com.springbootfinancetracker.dto;

import java.sql.Date;
import lombok.Data;

@Data
public class FinancialGoalDto {
    private Integer goalID;
    private Integer targetamount;
    private Integer currentAmount;
    private Date dueDate;
}

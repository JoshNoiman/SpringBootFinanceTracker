package com.springbootfinancetracker.dto;

import java.sql.Date;
import lombok.Data;

@Data
public class TransactionDto {
    private Integer transactionID;
    private Integer amount;
    private String category;
    private Date date;
}

package com.springbootfinancetracker.dto;

import lombok.Data;

@Data
public class AccountDto {
    private Integer accountID;
    private Integer userID;
    private Integer balance;
}

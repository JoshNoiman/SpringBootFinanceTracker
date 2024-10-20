package com.springbootfinancetracker.dto;

import lombok.Data;

@Data
public class UserDto {
    private Integer userID;
    private String password;
    private String username;
    private Double Income;
}

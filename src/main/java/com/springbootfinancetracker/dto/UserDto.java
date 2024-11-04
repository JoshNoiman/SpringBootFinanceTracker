package com.springbootfinancetracker.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * User Data Transfer Object
 */
@Data
public class UserDto {
    private Integer userID;
    private String password;
    private String username;
    private BigDecimal income = BigDecimal.ZERO;

}

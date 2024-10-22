package com.springbootfinancetracker.dto;

import lombok.Data;

/**
 * User Data Transfer Object
 */
@Data
public class UserDto {
    private Integer userID;
    private String password;
    private String username;
    private Double Income;
}

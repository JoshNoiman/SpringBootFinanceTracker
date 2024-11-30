package com.springbootfinancetracker.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * User Data Transfer Object
 */
@Entity
@Data
public class UserDto {
    @Id
    @GeneratedValue
    private Integer userId;
    private String password;
    private String username;
    private Double income;
}

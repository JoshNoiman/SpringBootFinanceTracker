package com.springbootfinancetracker.dao;

import java.util.List;

import com.springbootfinancetracker.dto.UserDto;

/**
 * Interface for user data access operations.
 */
public interface IUserDao {
    /**
     * Saves a user.
     * @param user the user DTO
     * @return the saved user DTO
     * @throws Exception if an error occurs during saving
     */
    UserDto saveUser(UserDto user) throws Exception;

    /**
     * Fetches all users.
     * @return the list of all user DTOs
     */
    List<UserDto> fetchAll();
}

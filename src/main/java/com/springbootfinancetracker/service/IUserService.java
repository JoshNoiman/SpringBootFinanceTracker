package com.springbootfinancetracker.service;

import java.util.List;

import com.springbootfinancetracker.dto.UserDto;

/**
 * Interface for user service operations.
 */
public interface IUserService {
    
    /**
     * Saves a new user.
     * @param newUser the new user DTO
     * @return the saved user DTO
     * @throws Exception if an error occurs during saving
     */
    public UserDto saveUser(UserDto newUser) throws Exception;

    /**
     * Fetches a user by ID.
     * @param id the user ID
     * @return the user DTO
     */
    public UserDto fetchById(int id);

    /**
     * Fetches all users.
     * @return the list of all user DTOs
     */
    public List<UserDto> fetchAll();

}

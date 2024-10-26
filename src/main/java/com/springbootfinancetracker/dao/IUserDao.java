package com.springbootfinancetracker.dao;

import com.springbootfinancetracker.dto.UserDto;
import org.springframework.boot.context.config.InactiveConfigDataAccessException;

import java.util.List;

/**
 * 
 * Interface data access object
 */
public interface IUserDao {
    /*
     * Method that saves user
     */
    UserDto saveUser(UserDto user) throws Exception;
    /**
     * 
     * @return all users
     */
    List<UserDto> fetchAll() throws Exception;

    /**
     * Grab user by their associated ID
     * @param id
     * @return user
     */
    UserDto fetchUserById(int id) throws Exception;
}

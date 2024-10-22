package com.springbootfinancetracker.dao;

import com.springbootfinancetracker.dto.UserDto;
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
    List<UserDto> fetchAll();
}

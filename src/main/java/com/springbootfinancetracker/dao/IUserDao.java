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
    List<UserDto> fetchAll() throws Exception;

    /**
     * Grab user by their associated ID
     * @param id
     * @return user
     */
    UserDto fetchUserById(int id) throws Exception;
    /*
     * Sets the user's ID, UserName, and Password
     * @params The user ID to be set, as well as the Password and the Username
     */
    String RegisterUser(UserDto newUser);
    /*
     * Checks the entered Username and Password to see if it matches any accounts
     * 
     * @params The UserName and ID to be checked
     */
    String LoginUser(String userName, String password);
}

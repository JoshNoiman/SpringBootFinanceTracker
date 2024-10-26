package com.springbootfinancetracker.service;

import com.springbootfinancetracker.dto.UserDto;

import java.util.List;

public interface IUserService {
    
    /**
     * 
     * @param newUser
     * @return User
     * @throws Exception
     */
    UserDto saveUser(UserDto newUser) throws Exception;

    /**
     * 
     * @param id
     * @return User id
     */
    UserDto fetchById(int id) throws Exception;

    /**
     *
     * @return
     * @throws Exception
     */
    List<UserDto> fetchAllUsers() throws Exception;


}

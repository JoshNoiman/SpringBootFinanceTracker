package com.springbootfinancetracker.service;

import com.springbootfinancetracker.dto.UserDto;

public interface IUserService {
    
    /**
     * 
     * @param newUser
     * @return User
     * @throws Exception
     */
    public UserDto saveUser(UserDto newUser) throws Exception;

    /**
     * 
     * @param id
     * @return User id
     */
    public UserDto fetchById(int id);


}

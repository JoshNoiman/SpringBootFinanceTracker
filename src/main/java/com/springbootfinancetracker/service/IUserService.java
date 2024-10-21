package com.springbootfinancetracker.service;

import com.springbootfinancetracker.dto.UserDto;

public interface IUserService {
    
    public UserDto saveUser(UserDto newUser) throws Exception;
    public UserDto fetchById(int id);


}

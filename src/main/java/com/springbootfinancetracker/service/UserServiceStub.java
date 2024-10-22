package com.springbootfinancetracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootfinancetracker.dao.IUserDao;
import com.springbootfinancetracker.dto.UserDto;

/**
 * 
 */
@Service
public class UserServiceStub implements IUserService {

    @Autowired
    private IUserDao userDao;

    /**
     * 
     */
    public UserServiceStub() {

    }

    /**
     * 
     * @param userDao
     */
    public UserServiceStub(IUserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * Creates a user with hard coded values for testing purposes
     */
    @Override
    public UserDto fetchById(int id) {
        UserDto user = new UserDto();
        user.setUsername("Joe Brave");
        user.setPassword("Pa$$w0rd");
        user.setUserID(1);
        return user;
    }

    /**
     * Saves new user
     */
    @Override
    public UserDto saveUser(UserDto newUser) throws Exception {
        return userDao.saveUser(newUser);
    }

}

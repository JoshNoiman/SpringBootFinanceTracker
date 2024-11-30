package com.springbootfinancetracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootfinancetracker.dao.IUserDao;
import com.springbootfinancetracker.dao.IUserDaoDb;
import com.springbootfinancetracker.dto.UserDto;

import java.util.List;

/**
 * 
 */
@Service
public class UserServiceStub implements IUserService {

    @Autowired
    private IUserDaoDb userDao;

    /**
     * 
     */
    public UserServiceStub() {

    }

    /**
     * 
     * @param userDao
     */
    public UserServiceStub(IUserDaoDb userDao) {
        this.userDao = userDao;
    }

    /**
     * Creates a user with hard coded values for testing purposes
     */
    @Override
    public UserDto fetchById(int id) throws Exception {
        return userDao.findById(id).orElseThrow();
    }

    /**
     * Grab all users currently saved
     * @return list of all users
     * @throws Exception
     */
    @Override
    public List<UserDto> fetchAllUsers() throws Exception {
        return userDao.findAll();
    }

    /**
     * Saves new user
     */
    @Override
    public UserDto saveUser(UserDto newUser) throws Exception {
        return userDao.save(newUser);
    }

}

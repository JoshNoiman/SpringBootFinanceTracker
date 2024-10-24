package com.springbootfinancetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootfinancetracker.dao.IUserDao;
import com.springbootfinancetracker.dto.UserDto;

/**
 * Service class for user operations.
 */
@Service
public class UserServiceStub implements IUserService {

    @Autowired
    private IUserDao userDao;

    /**
     * Default constructor.
     */
    public UserServiceStub() {

    }

    /**
     * Constructor with IUserDao parameter.
     * @param userDao the user DAO
     */
    public UserServiceStub(IUserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * Fetches a user by ID with hardcoded values for testing purposes.
     * @param id the user ID
     * @return the user DTO
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
     * Saves a new user.
     * @param newUser the new user DTO
     * @return the saved user DTO
     * @throws Exception if an error occurs during saving
     */
    @Override
    public UserDto saveUser(UserDto newUser) throws Exception {
        return userDao.saveUser(newUser);
    }

    /**
     * Fetches all users.
     * @return the list of all user DTOs
     */
    @Override
    public List<UserDto> fetchAll() {
        return userDao.fetchAll();
    }
}

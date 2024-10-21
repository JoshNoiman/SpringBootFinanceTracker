package com.springbootfinancetracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootfinancetracker.dao.IUserDao;
import com.springbootfinancetracker.dto.UserDto;

@Service
public class UserServiceStub implements IUserService {

    @Autowired
    private IUserDao userDao;

    public UserServiceStub() {

    }

    public UserServiceStub(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserDto fetchById(int id) {
        UserDto user = new UserDto();
        user.setUsername("Joe Brave");
        user.setPassword("Pa$$w0rd");
        user.setUserID(1);
        return user;
    }

    @Override
    public UserDto saveUser(UserDto newUser) throws Exception {
        return userDao.saveUser(newUser);
    }

}

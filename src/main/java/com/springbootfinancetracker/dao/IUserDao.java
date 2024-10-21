package com.springbootfinancetracker.dao;

import com.springbootfinancetracker.dto.UserDto;
import java.util.List;

public interface IUserDao {
    UserDto saveUser(UserDto user) throws Exception;
    List<UserDto> fetchAll();
}

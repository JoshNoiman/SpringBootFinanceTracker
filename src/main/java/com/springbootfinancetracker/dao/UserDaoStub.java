package com.springbootfinancetracker.dao;

import org.springframework.stereotype.Repository;

import com.springbootfinancetracker.dto.UserDto;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

@Repository
public class UserDaoStub implements IUserDao{

    Map<Integer, UserDto> allUsers = new HashMap<>(); 

    @Override
    public UserDto saveUser(UserDto user) throws Exception {
        // TODO Auto-generated method stub
        allUsers.put(user.getUserID(), user);
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public List<UserDto> fetchAll() {
        List<UserDto> returnUsers = new ArrayList<>(allUsers.values());
        return returnUsers;
    }

}

package com.springbootfinancetracker.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.springbootfinancetracker.dto.UserDto;

/**
 * Stub implementation of IUserDao for testing purposes.
 */
@Repository
public class UserDaoStub implements IUserDao {

    private Map<Integer, UserDto> allUsers = new HashMap<>(); 

    /**
     * Saves a user.
     * @param user the user DTO
     * @return the saved user DTO
     * @throws Exception if an error occurs during saving
     */
    @Override
    public UserDto saveUser(UserDto user) throws Exception {
        // TODO Auto-generated method stub
        allUsers.put(user.getUserID(), user);
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    /**
     * Fetches all users.
     * @return the list of all user DTOs
     */
    @Override
    public List<UserDto> fetchAll() {
        return new ArrayList<>(allUsers.values());
    }

}

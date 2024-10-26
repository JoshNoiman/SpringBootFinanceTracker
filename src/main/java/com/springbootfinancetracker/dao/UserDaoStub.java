package com.springbootfinancetracker.dao;

import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import com.springbootfinancetracker.dto.UserDto;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

@Repository
/**
 * 
 */
public class UserDaoStub implements IUserDao{

    Map<Integer, UserDto> allUsers = new HashMap<>(); 

    /**
     * Saves user
     */
    @Override
    public UserDto saveUser(UserDto user) throws Exception {
        // TODO Auto-generated method stub
        allUsers.put(user.getUserId(), user);
        return user;
    }

    /**
     * Method for testing
     * @param user user to add
     */
    public void saveUserWithoutException(UserDto user) {
        allUsers.put(user.getUserId(), user);
    }

    /**
     * @return all users from list
     */
    @Override
    public List<UserDto> fetchAll() {
        return new ArrayList<>(allUsers.values());
    }

    /**
     * Grabs user specified by their associated id
     * @param id user's id
     * @return fetchedUser specified by id
     * @throws Exception
     */
    @Override
    public UserDto fetchUserById(int id) throws Exception {
        UserDto fetchedUser = new UserDto();
        fetchedUser.setUserId(id);
        return fetchedUser;
    }

}

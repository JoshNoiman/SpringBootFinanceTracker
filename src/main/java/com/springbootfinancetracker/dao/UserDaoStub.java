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
        allUsers.put(user.getUserID(), user);
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    /**
     * @return all users from list
     */
    @Override
    public List<UserDto> fetchAll() {
        List<UserDto> returnUsers = new ArrayList<>(allUsers.values());
        return returnUsers;
    }

    /**
     * Grabs user specified by their associated Id
     * @param id
     * @return fetchedUser specified by Id
     * @throws Exception
     */
    @Override
    public UserDto fetchUserById(int id) throws Exception {
        UserDto fetchedUser = new UserDto();
        fetchedUser.setUserID(id);
        return fetchedUser;
    }

}

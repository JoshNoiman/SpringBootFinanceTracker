package com.springbootfinancetracker.dao;

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
    * Registers a User for the finance tracker.
    * Checks if the user is already registered.
    * If not, Save the user.
    * @param newUser The UserDto to register.
    * @return A message indicating the registration result.
    */
    @Override
    public String RegisterUser(UserDto newUser) {
        List<UserDto> users = fetchAll();

        // Check if the user is already registered
        for (UserDto user : users) {
            if (newUser.getUserID() == user.getUserID()) {
                return "Error: this user is already registered in the system.";
            }
        }

        try {
            saveUser(newUser);
            return "Success: user registered successfully.";
        } catch (Exception e) {
            return "Error: could not save the user due to an internal error.";
        }
    }
    /**
     * Checks to see if the user is in database.
     * If true, login
     * If false, return incorrect password / username.
     * @param UserName The username being used to login
     * @param UserPassword The Password to be used at login.
     * @return A message confirming/denying access to finance tracker.
     */
    @Override
    public String LoginUser(String userName, String password) {
        List<UserDto> users = fetchAll(); //fetch all registered users

        for (UserDto user : users) {
            if (user.getUsername().equals(userName)) {
                // Username matches, check password associated
                if (user.getPassword().equals(password)) {
                    return "Login successful";
                } else {
                    return "Error: Incorrect Password / Username";
                }
            }
        }
        // If no match was found for the userName
        return "Error: Incorect Password / Username";
    }
}

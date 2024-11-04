package com.springbootfinancetracker;

import com.springbootfinancetracker.dao.IUserDao;
import com.springbootfinancetracker.dao.UserDaoStub;
import com.springbootfinancetracker.dto.UserDto;
import com.springbootfinancetracker.service.UserServiceStub;
import jakarta.annotation.ManagedBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Scope;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ManagedBean
@Scope("session")
public class UserServiceTests {

    @Autowired
    @InjectMocks
    private UserServiceStub userService;

    @MockBean
    private IUserDao userDao;

    @Test
    public void testFetchByUserIdAndReturnFirstUserIdContents() throws Exception {
        // Arrange
        int userID = 1;
        UserDto userBeingMocked = new UserDto();
        userBeingMocked.setUserID(userID);
        userBeingMocked.setUsername("Joe Brave");
        userBeingMocked.setPassword("Pa$$w0rd");

        when(userDao.fetchUserById(userID)).thenReturn(userBeingMocked);

        // Act
        UserDto user = userService.fetchById(userID);

        // Assert
        assertNotNull(user);
        assertEquals(Integer.valueOf(1), user.getUserID());
        assertEquals("Joe Brave", user.getUsername());
        assertEquals("Pa$$w0rd", user.getPassword());

        verify(userDao, times(1)).fetchUserById(userID);

    }

    @Test
    public void testFetchAllUsers() throws Exception {
        // Arrange
        UserDto user1 = new UserDto();
        user1.setUserID(1);
        user1.setUsername("First User");
        user1.setPassword("First Password");

        UserDto user2 = new UserDto();
        user2.setUserID(2);
        user2.setUsername("Second User");
        user2.setPassword("Second Password");

        List<UserDto> mockedUsers = Arrays.asList(user1, user2);

        when(userDao.fetchAll()).thenReturn(mockedUsers);

        // Act
        List<UserDto> fetchedUsers = userService.fetchAllUsers();

        // Assert
        assertNotNull(fetchedUsers);
        assertEquals(2, fetchedUsers.size());
        assertEquals(Integer.valueOf(1), fetchedUsers.get(0).getUserID());
        assertEquals("First User", fetchedUsers.get(0).getUsername());
        assertEquals(Integer.valueOf(2), fetchedUsers.get(1).getUserID());
        assertEquals("Second User", fetchedUsers.get(1).getUsername());

        verify(userDao, times(1)).fetchAll();
    }

    @Test
    public void testSavedUserAndEnsureTestIsPassed() throws Exception {
        // Arrange
        UserDto newCreatedUser = new UserDto();
        newCreatedUser.setUserID(3);
        newCreatedUser.setUsername("User 3");
        newCreatedUser.setPassword("Password 3");

        when(userDao.saveUser(newCreatedUser)).thenReturn(newCreatedUser);
        when(userDao.fetchUserById(3)).thenReturn(newCreatedUser);

        // Act
        UserDto newSavedUser = userService.saveUser(newCreatedUser);

        // Assert
        assertNotNull(newSavedUser);
        assertEquals(newCreatedUser.getUserID(), newSavedUser.getUserID());
        assertEquals(newCreatedUser.getUsername(), newSavedUser.getUsername());
        assertEquals(newCreatedUser.getPassword(), newSavedUser.getPassword());

        verify(userDao, times(1)).saveUser(newCreatedUser);

    }
}

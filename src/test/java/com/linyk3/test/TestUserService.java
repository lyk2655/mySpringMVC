package com.linyk3.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.linyk3.domain.User;
import com.linyk3.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class TestUserService {
    @Autowired
    private UserService userService;

    @Test
    public void hasMatchedUser() {
        boolean b1 = userService.hasMatchUser("admin", "123456");
        boolean b2 = userService.hasMatchUser("admin", "1236");

        
        assertTrue(b1);
        //assertTrue(!b2);
    }
    
    @Test
    public void findUserByUsername(){
        User user = userService.findUserByUsername("linyk3");
        System.out.println(user.toString());
        assertEquals(user.getUserName(), "admin");
        user.setLastIp("192.168.11.188");
        user.setLastVisit(new Date());
        userService.loginSuccess(user);
    }
    
}
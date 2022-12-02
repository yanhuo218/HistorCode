package com.Spring.service;

import com.SpringDemo.config.SpringConfig;
import com.SpringDemo.domain.User;
import com.SpringDemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void testGetById() {
        User user = userService.getId(1);
        System.out.println(user);
    }
    @Test
    public void addUser(){
        Boolean aaa = userService.save(new User(null, "aaa", "123"));
        System.out.println(aaa);
    }
}

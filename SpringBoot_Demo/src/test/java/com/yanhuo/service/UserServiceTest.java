package com.yanhuo.service;


import com.yanhuo.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void testGetById() {
        User user = userService.getId(1);
    }
    @Test
    public void addUser(){
        Boolean aaa = userService.save(new User(null, "aaa", "123"));
        System.out.println(aaa);
    }
}

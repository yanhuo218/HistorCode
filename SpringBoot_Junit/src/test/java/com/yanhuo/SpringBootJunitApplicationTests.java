package com.yanhuo;

import com.yanhuo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJunitApplicationTests {

    @Autowired
    public UserService userService;
    @Test
    void contextLoads() {
        userService.save();
    }

}

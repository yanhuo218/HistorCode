package com.TestSpring.Demo2;

import com.TestSpring.Demo2.config.SpringConfig;
import com.TestSpring.Demo2.pojo.user;
import com.TestSpring.Demo2.service.impl.UserSelect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class Test1 {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserSelect userSelect = ctx.getBean(UserSelect.class);
        List<user> users = userSelect.selectUser();
        for (user user : users) {
            System.out.println(user);
        }
    }
}

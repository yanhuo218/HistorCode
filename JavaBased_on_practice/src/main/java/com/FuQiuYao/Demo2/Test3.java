package com.FuQiuYao.Demo2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<User> users = new LinkedList<>();
        List<Student> student = new LinkedList<>();
        List<User> user2 = new ArrayList<>();
        User user = new User();
        user.setId("10");
        user.setName("aaaa");
        user.setPassword("122313");
        users.add(user);
        users.add(user);
        users.add(user);
        users.add(user);
        for (User user1 : users) {
            System.out.println(user1);
        }
        user2 = users;
        System.out.println(user2);
    }
}

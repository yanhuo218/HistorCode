package com.yanhuo.controller;


import com.yanhuo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private User user;
    @GetMapping("/{id}")
    public String getId(@PathVariable Integer id) {
        System.out.println(user);
        System.out.println("i ==>" + id);
        return "aaa";
    }
}

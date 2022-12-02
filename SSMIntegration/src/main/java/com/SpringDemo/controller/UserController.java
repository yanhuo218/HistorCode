package com.SpringDemo.controller;

import com.SpringDemo.domain.User;
import com.SpringDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public Boolean save(@RequestBody User user) {
        return userService.save(user);
    }
    @PutMapping
    public Boolean update(@RequestBody User user) {
        return userService.update(user);
    }
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return userService.delete(id);
    }
    @GetMapping("/{id}")
    public User getId(@PathVariable Integer id) {
        return userService.getId(id);
    }
}

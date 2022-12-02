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
    public Result save(@RequestBody User user) {
        Boolean flag = userService.save(user);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }
    @PutMapping
    public Result update(@RequestBody User user) {
        Boolean flag = userService.update(user);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        Boolean flag = userService.delete(id);
        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }
    @GetMapping("/{id}")
    public Result getId(@PathVariable Integer id) {
        User user = userService.getId(id);
        Integer flag = user != null ? Code.GETID_OK:Code.GETID_ERR;
        String msg  = user != null ? "":"查询错误";
        return new Result(flag,user,msg);
    }
}

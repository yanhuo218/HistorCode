package com.yanhuo.service.impl;

import com.yanhuo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        System.out.println("aaaa");
    }
}

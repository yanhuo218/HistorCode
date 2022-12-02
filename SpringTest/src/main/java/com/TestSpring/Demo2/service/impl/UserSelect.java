package com.TestSpring.Demo2.service.impl;

import com.TestSpring.Demo2.dao.Mapper;
import com.TestSpring.Demo2.pojo.user;
import com.TestSpring.Demo2.service.AccountSelect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSelect implements AccountSelect {
    @Autowired
    private Mapper mapper;

    @Override
    public List<user> selectUser() {
        return mapper.selectUser();
    }
}

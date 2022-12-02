package com.TestSpring.Demo2.service;

import com.TestSpring.Demo2.dao.Mapper;
import com.TestSpring.Demo2.pojo.user;

import java.util.List;

public interface AccountSelect {
    List<user> selectUser();
}

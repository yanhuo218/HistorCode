package com.SpringDemo.service.impl;

import com.SpringDemo.controller.Code;
import com.SpringDemo.dao.UserDao;
import com.SpringDemo.domain.User;
import com.SpringDemo.exception.BusinessException;
import com.SpringDemo.service.UserService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public Boolean save(User user) {
        userDao.save(user);
        return true;
    }

    @Override
    public Boolean update(User user) {
        userDao.update(user);
        return true;
    }

    @Override
    public Boolean delete(Integer id) {
        userDao.delete(id);
        return true;
    }

    @Override
    public User getId(Integer id) {
        return userDao.getId(id);
    }
}

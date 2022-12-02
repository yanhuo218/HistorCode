package com.yanhuo.service.impl;

import com.yanhuo.dao.UserDao;
import com.yanhuo.domain.User;
import com.yanhuo.service.UserService;
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

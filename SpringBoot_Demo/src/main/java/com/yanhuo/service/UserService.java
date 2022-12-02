package com.yanhuo.service;

import com.yanhuo.domain.User;

public interface UserService {
    public Boolean save(User user);

    public Boolean update(User user);

    public Boolean delete(Integer id);

    public User getId(Integer id);
}

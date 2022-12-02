package com.SpringDemo.service;

import com.SpringDemo.domain.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserService {
    public Boolean save(User user);

    public Boolean update(User user);

    public Boolean delete(Integer id);

    public User getId(Integer id);
}

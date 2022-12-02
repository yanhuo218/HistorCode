package com.yanhuo;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yanhuo.dao.UserDao;
import com.yanhuo.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {
    @Autowired
    private UserDao userDao;
    @Test
    void contextLoads() {
    }

    @Test
    public void TestGetAll(){
//        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        wrapper.gt("id",6);
//        List<User> users = userDao.selectList(wrapper);
//        System.out.println(users);

//        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        wrapper.lambda().gt(User::getId,10);
//        List<User> users = userDao.selectList(wrapper);
//        System.out.println(users);


        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.gt(User::getId,10);
        List<User> users = userDao.selectList(wrapper);
        System.out.println(users);
    }
}

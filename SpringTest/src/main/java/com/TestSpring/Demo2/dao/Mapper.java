package com.TestSpring.Demo2.dao;

import com.TestSpring.Demo2.pojo.user;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Mapper {
    @Select("select * from user")
    List<user> selectUser();
}

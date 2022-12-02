package com.yanhuo.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yanhuo.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {

}

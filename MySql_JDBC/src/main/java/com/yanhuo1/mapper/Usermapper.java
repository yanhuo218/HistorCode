package com.yanhuo1.mapper;

import com.yanhuo1.pojo.User;

import java.util.List;

/**
 * @author 付秋垚
 */
public interface Usermapper {
    /**
     * 返回User集合
     * @return
     */
    List<User> selectAll();


}

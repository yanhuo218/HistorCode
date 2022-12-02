package com.yanhuo.dao;

import com.yanhuo.domain.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserDao {
    @Insert("insert into user values (null,#{username},#{password})")
    void save(User user);

    @Update("update user set  username = #{username}, password = #{password} where id = #{id}")
    void update(User user);

    @Delete("delete from user where id = #{id}")
    void delete(Integer id);

    @Select("select * from user where id = #{id}")
    User getId(Integer id);
}

package com.yanhuo1;

import com.yanhuo1.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import java.io.InputStream;
import java.util.List;

/**
 * @author 付秋垚
 */
public class Dome1_test {
    public static void main(String[] args) throws Exception{
        String resourse = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resourse);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList("test.selectAll");
        System.out.println(users);
        sqlSession.close();
    }
}

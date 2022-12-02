package com.FuQiuYao;

import com.FuQiuYao.mapper.Mapper;
import com.FuQiuYao.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3. 执行sql
        Mapper brandMapper = sqlSession.getMapper(Mapper.class);
        List<Brand> brands = brandMapper.selectAll();
        System.out.println(brands);
        //4. 释放资源
        sqlSession.close();
    }
}

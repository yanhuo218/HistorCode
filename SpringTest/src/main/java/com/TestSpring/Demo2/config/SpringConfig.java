package com.TestSpring.Demo2.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Repository;


@Configuration  //类注解
@Repository    //自动装配
@ComponentScan("com.TestSpring.Demo2")  //扫描
@PropertySource("classpath:jdbc.properties")
@Import({JDBCConfig.class, MybatisConfig.class})  //导入类
public class SpringConfig {
}
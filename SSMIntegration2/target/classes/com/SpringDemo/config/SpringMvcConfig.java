package com.SpringDemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.SpringDemo.controller","com.SpringDemo.config"})
@EnableWebMvc
public class SpringMvcConfig {

}

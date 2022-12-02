package com.yanhuo9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LogbackDome1 {
    public static final Logger LOGGER =  LoggerFactory.getLogger("LogbackDome1.class");
    public static void main(String[] args) {
        while (true) {
            try {
                LOGGER.info("aaa");
                LOGGER.info("bbb");
                int a = 10;
                int b = 0;
                LOGGER.info("a = " + a);
                LOGGER.info("b = " + b);
                System.out.println(a/b);
            } catch (Exception e) {
                LOGGER.info("错误"+e);
            }
        }

    }
}

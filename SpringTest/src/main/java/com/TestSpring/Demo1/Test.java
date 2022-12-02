package com.TestSpring.Demo1;


import com.TestSpring.Demo1.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml.tt");
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.BookService();
    }
}

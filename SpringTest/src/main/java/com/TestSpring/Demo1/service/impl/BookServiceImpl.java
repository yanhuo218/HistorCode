package com.TestSpring.Demo1.service.impl;

import com.TestSpring.Demo1.dao.impl.BookDaoImpl;
import com.TestSpring.Demo1.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDaoImpl bookDao;
    @Override
    public void BookService() {
        System.out.println("BookService");
        bookDao.BookDao();
    }

    public void setBookDao(BookDaoImpl bookDao) {
        this.bookDao = bookDao;
    }
}

package com.qiu.service;

import com.qiu.dao.BookDao;
import com.qiu.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookDao bookDao;

    public void add(Book book) {
        bookDao.add(book);
    }

    public void retrieveAll() {
        bookDao.retrieveAll();
    }

    public void retrieveSingle(Book book) {
        bookDao.retrieveSingle(book);
    }

    public void batchSetOperate(List<Object[]> list) {
        bookDao.batchSet(list);
    }

    public void batchDelOperate(List<Object[]> list) {
        bookDao.batchDel(list);
    }
}

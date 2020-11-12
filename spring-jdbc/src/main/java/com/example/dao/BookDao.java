package com.example.dao;

import com.example.entity.Book;

import java.util.List;

public interface BookDao {
    public void add(Book book);
    public void retrieveAll();
    public void retrieveSingle(Book book);

    void batchSet(List<Object[]> args);

    void batchDel(List<Object[]> ids);


}

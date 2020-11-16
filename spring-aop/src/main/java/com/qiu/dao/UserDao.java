package com.qiu.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    public int add(int a, int b);

    public int subtraction(int a, int b);
}

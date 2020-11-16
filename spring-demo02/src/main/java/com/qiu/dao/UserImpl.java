package com.qiu.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserImpl implements UserDao{
    public void add() {
        System.out.println("userImpl add...");
    }
}

package com.example.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    public int add(int a,int b) {
        System.out.println("add...");
        return a+b;
    }

    public int subtraction(int a, int b) {
        System.out.println("sub...");
        return a-b;
    }
}

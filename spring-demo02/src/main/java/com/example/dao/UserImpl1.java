package com.example.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserImpl1 implements UserDao {
    public void add() {
        System.out.println("impl1 hahaha add...");
    }
}

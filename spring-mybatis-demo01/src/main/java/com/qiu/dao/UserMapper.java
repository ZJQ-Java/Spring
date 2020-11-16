package com.qiu.dao;

import com.qiu.entity.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectUser();
}
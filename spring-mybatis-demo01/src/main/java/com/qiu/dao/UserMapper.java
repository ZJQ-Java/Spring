package com.qiu.dao;

import com.qiu.entity.User;

import java.util.List;

//@Mapper
public interface UserMapper {
    public List<User> selectUser();

    public int addUser(User user);

    public int delUser(User user);
}
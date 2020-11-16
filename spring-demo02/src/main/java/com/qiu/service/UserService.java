package com.qiu.service;

import com.qiu.beanDemo.User;
import com.qiu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Autowired
    private User    user;
    /*@Autowired
    @Qualifier(value = "userImpl1")
    private UserDao userDao;*/
    @Resource(name = "userImpl1")
    private UserDao userDao;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void add() {
        userDao.add();
        System.out.println("userService add ...");
    }

    @Override
    public String toString() {
        return "UserService{" +
                "user1=" + user +
                '}';
    }
}

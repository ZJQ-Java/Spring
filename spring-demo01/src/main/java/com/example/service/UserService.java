package com.example.service;

import com.example.beanDemo.User;

//@Service
public class UserService {
    //    @Autowired
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void add() {
        user.add();
        System.out.println("userService add ...");
    }

    @Override
    public String toString() {
        return "UserService{" +
                "user1=" + user   +
                '}';
    }
}

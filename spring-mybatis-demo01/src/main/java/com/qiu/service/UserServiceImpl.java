package com.qiu.service;

import com.qiu.dao.UserMapper;
import com.qiu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public void transactionTest(User user) {

        userMapper.addUser(user);
        user.setId(1);
        userMapper.delUser(user);
    }
}

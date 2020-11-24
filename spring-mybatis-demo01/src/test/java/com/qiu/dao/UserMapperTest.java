package com.qiu.dao;

import com.qiu.entity.User;
import com.qiu.service.UserService;
import com.qiu.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;


public class UserMapperTest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

    @Test
    public void selectUsers() {
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        List<User> users = userMapper.selectUser();
        System.out.println(users);
    }

    @Test
    public void testUsers() {
        UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
        User user = new User();
        user.setPwd("testPwd");
        user.setName("test");
        user.setCreateTime(new Date());
        user.setModifyTime(new Date());
        userService.transactionTest(user);
    }
}

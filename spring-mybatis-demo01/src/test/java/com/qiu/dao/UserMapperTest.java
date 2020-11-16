package com.qiu.dao;

import com.qiu.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class UserMapperTest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    @Test
    public void selectUsers(){
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        List<User> users = userMapper.selectUser();
        System.out.println(users);
    }
}

package com.example.beanDemo;

import com.example.AppConfig;
import com.example.beanDemo.User;
import com.example.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class UserTest {
//    public static ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
    public static ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    @Test
    public void UserTest(){
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user.toString());
        user.setAge(9999);
        User user1 = applicationContext.getBean("user", User.class);
        System.out.println(user1.toString());
        /*User user1 = applicationContext.getBean("user1", User.class);
        System.out.println(user1.toString());*/
    }

    @Test
    public void UserServiceTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = applicationContext.getBean("userService", UserService.class);

        userService.add();
//        System.out.println(userService);
    }
}

package com.qiu.dao;


import com.qiu.AppConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserDaoImplTest {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    @Test
    public void before() {
        UserDaoImpl bean = applicationContext.getBean(UserDaoImpl.class);
        int add = bean.add(1, 2);
//        System.out.println(add);
    }
}

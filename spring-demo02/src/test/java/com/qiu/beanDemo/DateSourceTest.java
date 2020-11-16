package com.qiu.beanDemo;

import com.qiu.AppConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DateSourceTest {
    private static ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    public void testDataSource(){
        Object dataSource = applicationContext.getBean("dataSource");
        System.out.println(dataSource);
    }
}

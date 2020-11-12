package com.example.beanDemo;


import com.example.AppConfig;
import com.example.beanDemo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PeopleTest {
    private static ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    public void peopleTest(){
        People getPeople = applicationContext.getBean("getPeople", People.class);
        getPeople.update();
    }
}

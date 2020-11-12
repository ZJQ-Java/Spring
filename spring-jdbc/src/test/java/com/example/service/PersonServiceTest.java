package com.example.service;


import com.example.AppConfig;
import com.example.entity.Person;
import com.example.service.PersonService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonServiceTest {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    public void testTransactionManager() {
        PersonService personBean = applicationContext.getBean(PersonService.class);
        Person src = new Person();
        src.setId(1);
        Person target = new Person();
        target.setId(2);
        personBean.transferMoney(src, target);
    }
}

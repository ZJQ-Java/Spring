package com.qiu.service;


import com.qiu.AppConfig;
import com.qiu.entity.Person;
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

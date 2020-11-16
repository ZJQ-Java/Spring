package com.qiu;

import com.qiu.beanDemo.People;
import com.qiu.beanDemo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@ImportResource({"spring-ioc.xml"})
public class AppConfig {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            System.out.println("beanName: " + beanName);
        }
    }
    @Bean
    public People getPeople(User user){
        return new People("node","mouse", user);
    }
}

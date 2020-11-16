package com.qiu.beanDemo;

import org.springframework.stereotype.Repository;

@Repository
public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public Integer getAge() {
        return age;
    }

//    public void setAge(Integer age) {
//        this.age = age;
//    }

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void add(){
        System.out.println("add...");
    }
}

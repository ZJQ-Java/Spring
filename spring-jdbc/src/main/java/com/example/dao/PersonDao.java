package com.example.dao;

import com.example.entity.Person;

public interface PersonDao {
    void transferMoney(Person srcPerson, Person targetPerson);
    void addMoney(Person person);
    void subMoney(Person person);
}

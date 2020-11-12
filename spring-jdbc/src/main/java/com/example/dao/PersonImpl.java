package com.example.dao;

import com.example.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PersonImpl implements PersonDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    @Transactional
    public void transferMoney(Person srcPerson, Person targetPerson) {
        subMoney(srcPerson);
        int i = 10/0;
        addMoney(targetPerson);
    }

    @Override
    public void addMoney(Person person) {
        String sql = "update person set money=money+? where id=?";
        Object[] args = {person.getId()};
        int update = jdbcTemplate.update(sql,10000, args);
        System.out.println(update);
    }

    @Override
    public void subMoney(Person person) {
        String sql = "update person set money=money-10000 where id=?";
        Object[] args = {person.getId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }
}

package com.example.service;

import com.example.dao.PersonDao;
import com.example.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonDao personDao;

    public void transferMoney(Person src,Person target){
        personDao.transferMoney(src,target);
    }
}

package com.qiu.service;

import com.qiu.dao.PersonDao;
import com.qiu.entity.Person;
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

package com.qiu.dao;

import com.qiu.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
public interface UserMapper {
    public List<User> selectUser();
}
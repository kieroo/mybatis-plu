package com.mybatis.dao;

import com.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    User selectByPrimaryKey(Integer userId);
    List<User> selectAll();
}

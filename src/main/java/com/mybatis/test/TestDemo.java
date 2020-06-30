package com.mybatis.test;

import com.mybatis.dao.UserMapper;
import com.mybatis.factory.DefaultSqlSessionFactory;
import com.mybatis.factory.SqlSessionFactory;
import com.mybatis.pojo.User;
import com.mybatis.session.SqlSession;

public class TestDemo {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = new DefaultSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectByPrimaryKey(44);
        System.out.println(user);
    }
}

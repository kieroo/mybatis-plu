package com.mybatis.factory;

import com.mybatis.session.SqlSession;

public interface SqlSessionFactory {
    SqlSession openSession();
}

package com.mybatis.bind;

import com.mybatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;

public class MapperProxy implements InvocationHandler {
    private SqlSession sqlSession;

    public MapperProxy(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getDeclaringClass().getName() + method.getName());
        if (Collection.class.isAssignableFrom(method.getReturnType())) {
            return sqlSession.selectList(method.getDeclaringClass().getName() + "." + method.getName(), args == null ? null : args[0]);
        } else {
            return sqlSession.selectOne(method.getDeclaringClass().getName() + "." + method.getName(), args == null ? null : args[0]);
        }
    }
}

package com.mybatis.session;

import com.mybatis.bind.MapperProxy;
import com.mybatis.configuration.MapperConfiguration;
import com.mybatis.configuration.MapperStatement;
import com.mybatis.executor.Executor;
import com.mybatis.executor.SimpleExecutor;

import java.lang.reflect.Proxy;
import java.util.List;

public class DefaultSqlSession implements SqlSession {

    private final MapperConfiguration configuration;
    private Executor executor;

    public DefaultSqlSession(MapperConfiguration configuration) {
        super();
        this.configuration = configuration;
        executor = new SimpleExecutor(configuration);
    }

    @Override
    public <T> T selectOne(String statement, Object parameter) {
        List<T> selectList = selectList(statement, parameter);
        if(selectList == null || selectList.size() == 0){
            return null;
        }
        if(selectList.size() == 1){
            return selectList.get(0);
        }else {
            throw new RuntimeException("too many result");
        }
    }

    @Override
    public <T> List<T> selectList(String statement, Object parameter) {
        MapperStatement ms = configuration.getMappedStatement().get(statement);
        return executor.query(ms,parameter);
    }

    @Override
    public <T> T getMapper(Class<T> type) {
        MapperProxy mapperProxy = new MapperProxy(this);
        return (T) Proxy.newProxyInstance(type.getClassLoader(),new Class[]{type},mapperProxy);
    }
}

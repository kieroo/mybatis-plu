package com.mybatis.executor;

import com.mybatis.configuration.MapperStatement;

import java.util.List;

public interface Executor {
    <E> List<E> query(MapperStatement ms, Object parameter);
}

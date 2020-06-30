package com.mybatis.executor;

import com.mybatis.configuration.MapperConfiguration;
import com.mybatis.configuration.MapperStatement;
import com.mybatis.utils.ReflectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SimpleExecutor implements Executor {
    private MapperConfiguration configuration;

    public SimpleExecutor(MapperConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public <E> List<E> query(MapperStatement ms, Object parameter) {
        System.out.println(ms.getSql().toString());
        List<E> ret = new ArrayList<>();
        try {
            Class.forName(configuration.getJdbcDriver());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(configuration.getJdbcUrl(), configuration.getJdbcUserName(), configuration.getJdbcPassword());
            String regex = "#\\{([^}])*\\}";
            //将sql语句中的#{}替换为?
            String sql = ms.getSql().replaceAll(regex, "?");
            preparedStatement = connection.prepareStatement(sql);
            //处理占位符，把占位符替换成参数
            parameterSize(preparedStatement, parameter);
            resultSet = preparedStatement.executeQuery();
            handleResultSet(resultSet, ret, ms.getResultType());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ret;
    }

    private void parameterSize(PreparedStatement preparedStatement, Object parameter) throws SQLException {
        if (parameter instanceof Integer) {
            preparedStatement.setInt(1, (Integer) parameter);
        } else if (parameter instanceof Long) {
            preparedStatement.setLong(1, (Long) parameter);
        } else if (parameter instanceof String) {
            preparedStatement.setString(1, (String) parameter);
        }
    }

    private <E> void handleResultSet(ResultSet resultSet, List<E> ret, String className) {
        Class<E> clazz = null;
        try {
            clazz = (Class<E>) Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            while (resultSet.next()) {
                E entity = clazz.newInstance();
                ReflectionUtil.setPropToBeanFromResultSet(entity, resultSet);
                ret.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

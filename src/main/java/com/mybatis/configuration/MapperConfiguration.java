package com.mybatis.configuration;

import java.util.HashMap;
import java.util.Map;

public class MapperConfiguration {
    private String jdbcDriver;
    private String jdbcUrl;
    private String jdbcUserName;
    private String jdbcPassword;
    private Map<String,MapperStatement> mappedStatement = new HashMap<>();

    public String getJdbcDriver() {
        return jdbcDriver;
    }

    public void setJdbcDriver(String jdbcDriver) {
        this.jdbcDriver = jdbcDriver;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getJdbcUserName() {
        return jdbcUserName;
    }

    public void setJdbcUserName(String jdbcUserName) {
        this.jdbcUserName = jdbcUserName;
    }

    public String getJdbcPassword() {
        return jdbcPassword;
    }

    public void setJdbcPassword(String jdbcPassword) {
        this.jdbcPassword = jdbcPassword;
    }

    public Map<String, MapperStatement> getMappedStatement() {
        return mappedStatement;
    }

    public void setMappedStatement(Map<String, MapperStatement> mappedStatement) {
        this.mappedStatement = mappedStatement;
    }
}

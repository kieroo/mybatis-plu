package com.mybatis.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReflectionUtil {
    public static <E> void setPropToBeanFromResultSet(E entity, ResultSet resultSet) throws NoSuchMethodException, SQLException, InvocationTargetException, IllegalAccessException {
        Field[] fields = entity.getClass().getDeclaredFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            String column = humptoLine2(fieldName);
            StringBuffer sb = new StringBuffer();
            sb.append("set");
            sb.append(fieldName.substring(0, 1).toUpperCase());
            sb.append(fieldName.substring(1));
            Method method = entity.getClass().getDeclaredMethod(sb.toString(),field.getType());
            Object value = resultSet.getObject(column);
            method.invoke(entity,value);
        }
    }

    public static String humptoLine2(String str) {
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "_" + matcher.group(0).toLowerCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
}

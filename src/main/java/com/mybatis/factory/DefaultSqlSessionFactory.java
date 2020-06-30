package com.mybatis.factory;

import com.mybatis.configuration.MapperConfiguration;
import com.mybatis.configuration.MapperStatement;
import com.mybatis.session.DefaultSqlSession;
import com.mybatis.session.SqlSession;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final MapperConfiguration configuration = new MapperConfiguration();

    //xml存放的位置
    private static final String MAPPER_LOCATION = "mappers";
    //db配置文件的位置
    private static final String DB_CONFIG_LOCATION = "db.properties";

    public DefaultSqlSessionFactory() {
        loadDBInfo();
        loadMapperInfo();
    }

    private void loadDBInfo() {
        InputStream db = this.getClass().getClassLoader().getResourceAsStream(DB_CONFIG_LOCATION);
        Properties p = new Properties();
        try {
            p.load(db);
        } catch (IOException e) {
            e.printStackTrace();
        }
        configuration.setJdbcDriver(p.getProperty("jdbc.driver"));
        configuration.setJdbcUrl(p.getProperty("jdbc.url"));
        configuration.setJdbcUserName(p.getProperty("jdbc.username"));
        configuration.setJdbcPassword(p.getProperty("jdbc.password"));
    }

    private void loadMapperInfo() {
        URL resources = null;
        resources = this.getClass().getClassLoader().getResource(MAPPER_LOCATION);
        File mappers = new File(resources.getFile());
        if (mappers.isDirectory()) {
            File[] files = mappers.listFiles();
            for (File file : files) {
                loadMapperInfo(file);
            }
        }
    }

    private void loadMapperInfo(File file) {
        SAXReader reader = new SAXReader();
        //读文件转换成document对象
        Document document = null;
        try {
            document = reader.read(file);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        //获取根节点对象mapper
        Element e = document.getRootElement();
        //获取命名空间namespace
        String namespace = e.attribute("namespace").getData().toString();
        //获取select，insert，update，delete节点列表
        List<Element> all = new ArrayList<>();

        List<Element> selects = e.elements("select");
        List<Element> inserts = e.elements("insert");
        List<Element> updates = e.elements("update");
        List<Element> deletes = e.elements("delete");
        all.addAll(selects);
        all.addAll(inserts);
        all.addAll(updates);
        all.addAll(deletes);
        //遍历节点组装成mapperStatement存放到mapperConfiguration中
        for (Element ele : all) {
            MapperStatement mapperStatement = new MapperStatement();
            String id = ele.attribute("id").getData().toString();
            String resultType = ele.attribute("resultType").getData().toString();
            String sql = ele.getData().toString();
            mapperStatement.setId(id);
            mapperStatement.setNamespace(namespace);
            mapperStatement.setResultType(resultType);
            mapperStatement.setSql(sql);
            configuration.getMappedStatement().put(namespace+"."+id,mapperStatement);
        }
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(configuration);
    }
}

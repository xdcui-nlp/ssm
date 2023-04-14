package com.atguigu.spring;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @author xdcui
 * @program: SSM
 * @description:
 * @create 2023-02-06 15:09
 */
public class DataSourceTest {

    @Test
    public void testDataSource() throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-datasource.xml");
        DruidDataSource dataSource = ioc.getBean(DruidDataSource.class);
        System.out.println(dataSource.getConnection());
    }

}

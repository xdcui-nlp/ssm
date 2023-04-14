package com.atguigu.spring.test;

import com.atguigu.spring.aop.xml.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xdcui
 * @program: SSM
 * @description:
 * @create 2023-02-10 15:10
 */
public class AOPByXMLTest {

    @Test
    public void testAOPByXML(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-xml.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.add(1,1);
    }

}

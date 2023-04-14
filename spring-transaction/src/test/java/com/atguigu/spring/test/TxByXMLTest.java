package com.atguigu.spring.test;

import com.atguigu.spring.controller.BookController;
import com.atguigu.spring.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xdcui
 * @program: SSM
 * @description:
 * @create 2023-02-15 16:04
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-xml.xml")
public class TxByXMLTest {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook(){
        bookController.buyBook(1,1);
    }
}

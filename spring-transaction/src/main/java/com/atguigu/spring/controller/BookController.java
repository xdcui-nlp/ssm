package com.atguigu.spring.controller;

import com.atguigu.spring.service.BookService;
import com.atguigu.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author xdcui
 * @program: SSM
 * @description:
 * @create 2023-02-15 13:57
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CheckoutService checkoutService;

    public void buyBook(Integer userId, Integer bookId){
        bookService.buyBook(userId,bookId);
    }

    public void checkout(Integer userId, Integer[] bookIds){
        checkoutService.checkout(userId, bookIds);
    }

}

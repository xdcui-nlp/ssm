package com.atguigu.spring.service;

/**
 * @author xdcui
 * @program: SSM
 * @description:
 * @create 2023-02-15 13:57
 */
public interface BookService {

    /**
     * 买书
     * @param userId
     * @param bookId
     */
    void buyBook(Integer userId, Integer bookId);
}

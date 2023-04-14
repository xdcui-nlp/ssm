package com.atguigu.spring.service;

/**
 * @author xdcui
 * @program: SSM
 * @description:
 * @create 2023-02-15 15:45
 */
public interface CheckoutService {

    /**
     * 结账
     * @param userId
     * @param bookIds
     */
    void checkout(Integer userId, Integer[] bookIds);
}

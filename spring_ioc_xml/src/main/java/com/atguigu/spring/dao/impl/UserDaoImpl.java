package com.atguigu.spring.dao.impl;

import com.atguigu.spring.dao.UserDao;

/**
 * @author xdcui
 * @program: SSM
 * @description:
 * @create 2023-02-07 15:03
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}

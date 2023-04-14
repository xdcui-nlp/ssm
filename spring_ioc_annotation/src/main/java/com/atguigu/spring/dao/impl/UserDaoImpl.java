package com.atguigu.spring.dao.impl;

import com.atguigu.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author xdcui
 * @program: SSM
 * @description:
 * @create 2023-02-08 13:09
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}

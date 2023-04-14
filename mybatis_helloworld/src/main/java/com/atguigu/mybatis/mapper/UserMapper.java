package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

/**
 * @author xdcui
 * @program: SSM
 * @description:
 * @create 2022-12-29 17:34
 */
public interface UserMapper {

    /**
     * 添加用户信息
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    void deleteUser();

    /**
     * 根据id查询用户信息
     * @return
     */
    User getUserById();

    /**
     * 查询所有的用户信息
     * @return
     */
    List<User> getAllUser();

}

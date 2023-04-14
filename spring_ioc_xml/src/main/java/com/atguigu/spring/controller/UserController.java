package com.atguigu.spring.controller;

import com.atguigu.spring.service.UserService;

/**
 * @author xdcui
 * @program: SSM
 * @description:
 * @create 2023-02-07 15:01
 */
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser(){
        userService.saveUser();
    }
}

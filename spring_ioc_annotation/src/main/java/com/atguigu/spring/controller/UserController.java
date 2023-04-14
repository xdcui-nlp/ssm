package com.atguigu.spring.controller;

import com.atguigu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author xdcui
 * @program: SSM
 * @description:
 * @create 2023-02-08 13:05
 */
//@Controller("controller")
@Controller
public class UserController {

    //@Autowired(required = false)
    //@Qualifier("userServiceImpl")
    @Autowired
    private UserService userService;

//    public UserController(UserService userService) {
//        this.userService = userService;
//    }


//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }


    public void saveUser(){
        userService.saveUser();
    }

}

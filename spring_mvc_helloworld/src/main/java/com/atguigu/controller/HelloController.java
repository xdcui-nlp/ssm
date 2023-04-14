package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xdcui
 * @program: SSM
 * @description:
 * @create 2023-02-28 21:39
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String protal(){
        //将逻辑视图返回
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }

}

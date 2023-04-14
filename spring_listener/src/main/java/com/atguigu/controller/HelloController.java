package com.atguigu.controller;

import com.atguigu.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author xdcui
 * @program: SSM
 * @description:
 * @create 2023-03-12 14:14
 */
@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

}

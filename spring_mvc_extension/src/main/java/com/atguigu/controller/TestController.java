package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xdcui
 * @program: SSM
 * @description:
 * @create 2023-03-11 16:39
 */
@Controller
public class TestController {

    @RequestMapping("/test/hello")
    public String testHello(){
        System.out.println(1/0);
        return "success";
    }

}

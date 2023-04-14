package com.atguigu.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author xdcui
 * @program: SSM
 * @description:
 * @create 2023-02-10 14:46
 */
@Component
@Aspect
@Order(1)
public class ValidateAspect {

//    @Before("execution(* com.atguigu.spring.aop.annotation.CalculatorImpl.*(..))")
    @Before("com.atguigu.spring.aop.annotation.LoggerAspect.pointCut()")
    public void beforeMethod(){
        System.out.println("ValidateAspect-->前置通知");
    }

}

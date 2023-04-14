package com.atguigu.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author xdcui
 * @program: SSM
 * @description:
 * @create 2023-02-09 16:04
 */
@Component
public class LoggerAspect {

    public void beforeAdviceMethod(JoinPoint joinPoint){
        //获取连接点所对应的方法的签名信息
        Signature signature = joinPoint.getSignature();
        //获取连接点所对应的方法的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("LoggerAspect,方法：" + signature.getName() + ",参数：" + Arrays.toString(args));
    }

    public void afterAdviceMethod(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect,方法：" + signature.getName() + ",执行完毕");
    }

    /**
     * 在返回通知中若要获取目标对象方法的返回值
     * 只需要通过@AfterReturning注解的returning属性
     * 就可以将通知方法的某个参数指定为接受目标对象方法的返回值的参数
     * @param joinPoint
     * @param result
     */
    public void afterReturningAdviceMethod(JoinPoint joinPoint, Object result){
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect, 方法：" + signature.getName() + ", 结果:" + result);
    }

    /**
     * 在异常通知中若要获取目标对象方法的异常
     * 只需要通过@AfterThrowing注解的throwing属性
     * 就可以将通知方法的某个参数指定为接受目标对象方法出现的异常的参数
     * @param joinPoint
     * @param ex
     */
    public void afterThrowingAdviceMethod(JoinPoint joinPoint, Throwable ex){
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect, 方法：" + signature.getName() + ",异常通知" + ex);
    }

    //环绕通知的方法的返回值一定要和目标对象方法的返回值一致
    public Object aroundAdviceMethod(ProceedingJoinPoint joinPoint){
        //表示目标对象方法的执行
        Object result = null;
        try {
            System.out.println("环绕通知-->前置通知");
            result = joinPoint.proceed();
            System.out.println("环绕通知-->返回通知");
        } catch (Throwable e) {
            System.out.println("环绕通知-->异常通知");
            throw new RuntimeException(e);
        } finally {
            System.out.println("环绕通知-->后置通知");
        }
        return result;

    }

}

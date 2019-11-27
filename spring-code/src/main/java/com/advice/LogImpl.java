package com.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author:DENG-
 * @Date:2019/11/5 18:41
 */
@Component
@Aspect
public class LogImpl {

    @Pointcut("execution(* com.service..*.*(..))")
    public void myPointcut(){

    }

    @Before("myPointcut()")
    public void before(){
        System.out.println("before---------");
    }
}

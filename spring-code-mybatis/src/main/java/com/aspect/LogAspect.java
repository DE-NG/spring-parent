package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author:DENG-
 * @Date:2019/11/6 21:07
 */
@Component
@Aspect
public class LogAspect {
    @Pointcut("execution(* com.service..*.*(..))")
    public void myPointcut(){

    }

    @Around("myPointcut()")
    public Object around(ProceedingJoinPoint joinPoint){
        Object result = null;
        try {
            Long start = System.currentTimeMillis();
            result = joinPoint.proceed();
            Long end = System.currentTimeMillis();
            System.out.println("耗时：" + (end-start));
            System.out.println("------------------------------------------------");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }
}

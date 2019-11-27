package com.log;

import com.entity.Employee;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.List;

/**
 * @author DENG-
 */
public class LogImpl {
    public void before(int pageNum, int pageSize){
        System.out.println("before---------");
    }

    public List<Employee> around(ProceedingJoinPoint joinPoint){
        List<Employee> result = null;
        try {
            result = (List<Employee>) joinPoint.proceed();
            for (Employee employee : result) {
                System.out.println(employee);
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {

            System.out.println(arg);
        }
        return result;
    }
}

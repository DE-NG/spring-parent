package com;

import com.service.impl.ServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:DENG-
 * @Date:2019/10/30 21:02
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ServiceImpl service = context.getBean("serviceImpl", ServiceImpl.class);
        service.migration(1);
    }
}

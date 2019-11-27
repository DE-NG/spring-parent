package com.sqlsessionfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author DENG-
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext_sqlSessionFactory.xml");
        SqlSessionFactory factoryImpl = context.getBean("creator",SqlSessionFactory.class);
        System.out.println(factoryImpl.getProp());
    }
}

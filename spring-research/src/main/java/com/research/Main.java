package com.research;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author DENG-
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application_research.xml");
        System.out.println("......");
        A a = context.getBean("a",A.class);
        System.out.println(a);
    }
}

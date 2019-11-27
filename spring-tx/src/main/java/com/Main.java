package com;

import com.service.impl.DeptServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:DENG-
 * @Date:2019/10/30 11:34
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptServiceImpl deptService = context.getBean("deptService", DeptServiceImpl.class);
        //deptService.deleteWholeDeptById(4);
        deptService.getAllDept();
    }
}

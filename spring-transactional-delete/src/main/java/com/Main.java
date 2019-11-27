package com;

import com.service.EmployeeService;
import com.util.ConnectionHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author DENG-
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean("employeeService", EmployeeService.class).deleteDeptWithEmps(ConnectionHelper.getConn(),1);
    }
}

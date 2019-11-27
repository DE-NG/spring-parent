package com.service;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.entity.Employee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class EmployeeServiceTest {

    @Test
    public void getListEmployee() {
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService service = context.getBean("employeeService",EmployeeService.class);

      //  EmployeeDao dao = new EmployeeDaoImpl();
        List<Employee> employeeList = service.getListEmployee();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
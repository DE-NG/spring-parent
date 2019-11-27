package com.service;

import com.dao.EmployeeDao;
import com.entity.Employee;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author DENG-
 */
public class EmployeeService {
    EmployeeDao employeeDao;

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> getListEmployee(){
        return employeeDao.getListEmployee();
    }
}

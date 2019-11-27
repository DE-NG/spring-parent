package com.service;

import com.entity.Employee;

import java.util.List;

/**
 * @author DENG-
 */
public interface EmployeeService {
    List<Employee> getAll(int pageNum,int pageSize);
}

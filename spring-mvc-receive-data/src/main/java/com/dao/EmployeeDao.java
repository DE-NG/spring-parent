package com.dao;

import com.entity.Employee;
import org.springframework.stereotype.Repository;

/**
 * @Author:DENG-
 * @Date:2019/11/11 19:05
 */
@Repository
public interface EmployeeDao {
    int insert(Employee employee);
}

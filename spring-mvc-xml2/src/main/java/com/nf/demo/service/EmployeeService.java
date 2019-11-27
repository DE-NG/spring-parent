package com.nf.demo.service;

import com.nf.demo.entity.EmployeeEntity;

import java.util.List;

/**
 * @Author:DENG-
 * @Date:2019/11/21 19:26
 */
public interface EmployeeService {
    List<EmployeeEntity> getAll(int pageNum, int pageSize);

    void insert(EmployeeEntity employeeEntity);

    void deleteByDeptId(int deptid);
}

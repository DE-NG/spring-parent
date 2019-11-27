package com.service;

import com.entity.Employee;

import java.util.List;

/**
 * @Author:DENG-
 * @Date:2019/11/6 15:22
 */
public interface DeptService {
    void txDemo();

    List<Employee> getAll(int pageNum,int pageSize);
}

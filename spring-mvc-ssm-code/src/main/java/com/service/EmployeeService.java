package com.service;

import com.entity.EmployeeEntity;

import java.util.List;

/**
 * @Author:DENG-
 * @Date:2019/11/25 11:40
 */
public interface EmployeeService {
    List<EmployeeEntity> getAll(int pageNum,int pageSize);
}

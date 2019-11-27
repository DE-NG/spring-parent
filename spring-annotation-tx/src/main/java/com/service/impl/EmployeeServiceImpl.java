package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmployeeDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author:DENG-
 * @Date:2019/11/5 11:35
 */
@Service
public class EmployeeServiceImpl {
    private DeptDao deptDao;
    private EmployeeDao employeeDao;

    public EmployeeServiceImpl(DeptDao deptDao, EmployeeDao employeeDao) {
        this.deptDao = deptDao;
        this.employeeDao = employeeDao;
    }
    @Transactional
    public void deleteAndInsert(){
        deptDao.delete();;
        employeeDao.insert();
    }
}

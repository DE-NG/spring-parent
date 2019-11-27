package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmployeeDao;
import com.service.DeptService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author:DENG-
 * @Date:2019/11/5 18:26
 */
@Service
public class DeptServiceImpl implements DeptService {
    private DeptDao deptDao;
    private EmployeeDao employeeDao;

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    @Transactional
    public void delete() {
        employeeDao.delete();
        deptDao.delete();
    }
}

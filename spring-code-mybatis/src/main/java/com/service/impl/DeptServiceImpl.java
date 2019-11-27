package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmployeeDao;
import com.entity.Employee;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author:DENG-
 * @Date:2019/11/6 15:42
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    @Override
    public void txDemo() {
        employeeDao.delete();
        deptDao.delete();
    }

    @Override
    public List<Employee> getAll(int pageNum, int pageSize) {
        return employeeDao.getAll(pageNum,pageSize);
    }
}

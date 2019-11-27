package com.nf.demo.service.impl;

import com.nf.demo.dao.DeptDao;
import com.nf.demo.dao.EmployeeDao;
import com.nf.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:DENG-
 * @Date:2019/11/21 19:29
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DeptDao deptDao;

    @Override
    public void deleteById(int id) {
        employeeDao.deleteByDeptId(id);
        deptDao.deleteById(id);
    }
}

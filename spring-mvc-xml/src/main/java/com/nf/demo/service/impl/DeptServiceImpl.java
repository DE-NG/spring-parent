package com.nf.demo.service.impl;

import com.nf.demo.dao.DeptDao;
import com.nf.demo.dao.EmployeeDao;
import com.nf.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author:DENG-
 * @Date:2019/11/21 10:33
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    @Override
    public void deleteById(int id) {
        employeeDao.deleteByDeptId(id);
        deptDao.deleteById(id);
    }
}

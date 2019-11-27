package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmployeeDao;
import com.entity.Dept;

import java.util.List;

/**
 * @Author:DENG-
 * @Date:2019/10/30 11:05
 */
public class DeptServiceImpl {
    private DeptDao deptDao;
    private EmployeeDao employeeDao;

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void deleteWholeDeptById(int id){
        int a = employeeDao.deleteByDeptId(id);
        int b = deptDao.deleteByDeptId(id);
        System.out.println("---------" + a+b);
    }

    public void getAllDept(){
        List<Dept> result = deptDao.getAllDept();
        for (Dept dept : result) {
            System.out.println(dept);
        }

    }
}

package com.service;

import com.dao.DeptDao;
import com.dao.EmployeeDao;

import java.sql.Connection;

/**
 * @author DENG-
 */
public class EmployeeService {

    private DeptDao deptDao;
    private EmployeeDao employeeDao;

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public boolean deleteDeptWithEmps(Connection conn,int deptid){
        int nums = 0;
        int employeeNum = employeeDao.deleteEmpsByDeptId(conn,deptid);
        int deptNum = deptDao.deleteDeptById(conn,deptid);
        nums = employeeNum + deptNum;
        return nums>0?true:false;
    }
}

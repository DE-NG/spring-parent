package com.entity;

/**
 * @Author:DENG-
 * @Date:2019/11/11 19:03
 */
public class Employee {
    private String username;
    private Integer deptid;

    public Employee() {
    }

    public Employee(String username, Integer deptid) {
        this.username = username;
        this.deptid = deptid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "username='" + username + '\'' +
                ", deptid=" + deptid +
                '}';
    }
}

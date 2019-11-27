package com.entity;

import java.math.BigDecimal;


public class Employee {
    private Integer employeeid;
    private BigDecimal salary;
    private Integer gender;
    private String username;

    private Integer deptId;
    private Dept dept;
    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }


    public Employee() {
    }

    public Employee( BigDecimal salary, Integer gender, String username, Integer deptId) {

        this.salary = salary;
        this.gender = gender;
        this.username = username;
        this.deptId = deptId;
    }



    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }



    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeid=" + employeeid +
                ", salary=" + salary +
                ", gender=" + gender +
                ", username='" + username + '\'' +
                ", deptId=" + deptId +
                ", dept=" + dept +
                '}';
    }
}

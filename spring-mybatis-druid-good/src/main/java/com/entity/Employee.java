package com.entity;


import java.math.BigDecimal;
import java.util.Date;

/**
 * @author DENG-
 */
public class Employee {
   private Integer id;
   private String username;
   private Integer gender;
   private BigDecimal salary;
   private Date hiredate;
   private Integer deptid;

    public Employee() {
    }

    public Employee(Integer id, String username, Integer gender, BigDecimal salary, Date hiredate, Integer deptid) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.salary = salary;
        this.hiredate = hiredate;
        this.deptid = deptid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
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
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", hiredate=" + hiredate +
                ", deptid=" + deptid +
                '}';
    }
}

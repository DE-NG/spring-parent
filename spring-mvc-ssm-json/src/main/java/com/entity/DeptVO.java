package com.entity;

/**
 * @Author:DENG-
 * @Date:2019/11/18 11:15
 */
public class DeptVO {
    private Integer id;
    private String deptname;

    public DeptVO() {
    }

    public DeptVO(Integer id, String deptname) {
        this.id = id;
        this.deptname = deptname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    @Override
    public String toString() {
        return "DeptVO{" +
                "id=" + id +
                ", deptname='" + deptname + '\'' +
                '}';
    }
}

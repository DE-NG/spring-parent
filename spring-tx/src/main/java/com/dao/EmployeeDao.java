package com.dao;

/**
 * @author DENG-
 */
public class EmployeeDao extends BaseDao {
    public int deleteByDeptId(int deptid){
        String sql = "delete from employee where deptid=?";
        int rows = jdbcTemplate.update(sql,deptid);
        return rows;
    }
}

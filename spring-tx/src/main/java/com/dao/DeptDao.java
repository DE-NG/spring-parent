package com.dao;

import com.entity.Dept;

import java.util.List;

/**
 * @author DENG-
 */
public class DeptDao extends BaseDao {

    public int deleteByDeptId(int id){
        String sql = "delete from dept where id=?";
        int rows = jdbcTemplate.update(sql,id);
        return rows;
    }

    public List<Dept> getAllDept(){
        String sql = "select id,deptname from dept";
        List<Dept> result = jdbcTemplate.query(sql,new MyRowMapper());
       return result;
    }
}

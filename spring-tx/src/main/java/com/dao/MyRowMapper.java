package com.dao;

import com.entity.Dept;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author:DENG-
 * @Date:2019/10/30 14:45
 */
public class MyRowMapper implements RowMapper<Dept> {
    @Override
    public Dept mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer id = resultSet.getInt("id");
        String deptname = resultSet.getString("deptname");
        Dept dept = new Dept();
        dept.setId(id);
        dept.setDeptname(deptname);
        return dept;
    }
}

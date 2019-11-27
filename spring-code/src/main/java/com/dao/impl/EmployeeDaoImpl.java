package com.dao.impl;

import com.dao.EmployeeDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author:DENG-
 * @Date:2019/11/5 18:24
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void delete() {
        String sql = "delete from employee where id=19";
        jdbcTemplate.update(sql);
    }
}

package com.dao.impl;

import com.dao.DeptDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author:DENG-
 * @Date:2019/11/5 18:21
 */
@Repository
public class DeptDaoImpl implements DeptDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void delete() {
        String sql = "delete from dept where id=1";
        jdbcTemplate.update(sql);
    }
}

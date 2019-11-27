package com.dao.impl;

import com.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author:DENG-
 * @Date:2019/11/5 11:38
 */
@Repository
public class DeptDaoImpl implements DeptDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void delete() {
        String sql = "delete from dept where id=4";
        jdbcTemplate.update(sql);
    }
}

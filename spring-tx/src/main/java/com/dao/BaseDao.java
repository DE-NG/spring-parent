package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author DENG-
 */
public abstract class BaseDao {
    protected JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}

package com.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.dao.impl.DeptDaoImpl;
import com.dao.impl.EmployeeDaoImpl;
import com.service.impl.DeptServiceImpl;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Author:DENG-
 * @Date:2019/11/5 16:16
 */
@Configuration
@ComponentScan("com")
@EnableAspectJAutoProxy
@EnableTransactionManagement

public class MyConfig {
    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/deptdb");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public DataSourceTransactionManager transactionManager(){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource());
        return transactionManager;
    }

    @Bean
    public DeptDaoImpl deptDaoImpl(){
        DeptDaoImpl deptDao = new DeptDaoImpl();
        deptDao.setJdbcTemplate(jdbcTemplate());
        return deptDao;
    }

    @Bean
    public EmployeeDaoImpl employeeDaoImpl(){
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
        employeeDao.setJdbcTemplate(jdbcTemplate());
        return employeeDao;
    }
    @Bean
    public DeptServiceImpl deptServiceImpl(){
        DeptServiceImpl deptService = new DeptServiceImpl();
        deptService.setDeptDao(deptDaoImpl());
        deptService.setEmployeeDao(employeeDaoImpl());
        return deptService;
    }

}

package com.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Author:DENG-
 * @Date:2019/11/5 12:01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeeServiceImplTest {

    @Autowired
    private ApplicationContext context;
    @Test
    public void deleteAndInsert() {
        EmployeeServiceImpl service = context.getBean(EmployeeServiceImpl.class);
        service.deleteAndInsert();
    }
}
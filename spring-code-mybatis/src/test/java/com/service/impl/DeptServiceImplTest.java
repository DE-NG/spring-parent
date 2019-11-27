package com.service.impl;

import com.entity.Employee;
import com.service.DeptService;
import config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author:DENG-
 * @Date:2019/11/6 19:03
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class DeptServiceImplTest {

    @Autowired
    private DeptService service;


    @Test
    public void txDemo(){
        service.txDemo();
    }
    @Test
    public void getAll() {
        List<Employee> result = service.getAll(2,4);
        for (Employee employee : result) {
            System.out.println(employee);
        }
    }
}
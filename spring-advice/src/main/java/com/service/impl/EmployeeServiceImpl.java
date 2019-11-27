package com.service.impl;

import com.annotation.Frist;
import com.service.EmployeeService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author DENG-
 */
@Transactional
public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public void query() {
        System.out.println("query----");
    }
}

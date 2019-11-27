package com.service.impl;

import com.annotation.Frist;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.Target;

/**
 * @author DENG-
 */
public class EmployeeServiceImpl2 {
    @Frist
    public void query(){
        System.out.println("impl2---");
    }
}

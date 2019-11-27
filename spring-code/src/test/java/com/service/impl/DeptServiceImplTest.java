package com.service.impl;

import com.config.MyConfig;
import com.service.DeptService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * @Author:DENG-
 * @Date:2019/11/5 18:48
 */
public class DeptServiceImplTest {

    @Test
    public void delete() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        DeptService service = context.getBean(DeptService.class);
        service.delete();
    }
}
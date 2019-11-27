package com;

import javax.servlet.ServletContext;

/**
 * @Author:DENG-
 * @Date:2019/11/22 11:46
 */
public interface MyAppInitializer {
    void startUp(ServletContext sc);
}

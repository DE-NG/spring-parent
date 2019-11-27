package com;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * @Author:DENG-
 * @Date:2019/11/22 11:47
 */
public class MyAppInitializerImpl implements MyAppInitializer {
    @Override
    public void startUp(ServletContext sc) {
        ServletRegistration.Dynamic servletRegistration = sc.addServlet("second",new SecondServlet());
        servletRegistration.addMapping("/second");
    }
}

package com;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * @Author:DENG-
 * @Date:2019/11/22 11:37
 */
@HandlesTypes(MyAppInitializer.class)
public class MyServletContainerInit implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
//        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("first",new FirstServlet());
//        servletRegistration.addMapping("/first");

        for (Class<?> aClass : set) {
            if(MyAppInitializer.class.isAssignableFrom(aClass)){
                try {
                    MyAppInitializer myAppInitializer = (MyAppInitializer) aClass.newInstance();
                    myAppInitializer.startUp(servletContext);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

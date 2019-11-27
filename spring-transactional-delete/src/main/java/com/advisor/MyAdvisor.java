package com.advisor;

import com.util.ConnectionHelper;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.sql.Connection;

/**
 * @author DENG-
 */
public class MyAdvisor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Connection conn = (Connection) methodInvocation.getArguments()[0];
        boolean result;
            conn.setAutoCommit(false);
            result = (boolean) methodInvocation.proceed();
            if(result) {
                conn.commit();
                conn.setAutoCommit(true);
            }else {
                conn.rollback();
            }
            //conn.close();
            return result;
    }
}

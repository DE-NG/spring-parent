package com.research;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author DENG-
 */
public class A implements InitializingBean, FactoryBean {
    private B b;
    private C c;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public A() {
        System.out.println("A.....");
    }

    public A(B b, C c) {
        this.b = b;
        this.c = c;
        System.out.println("B+C.......");
    }

    public void init(){
        System.out.println("init....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet......");
    }

    @Override
    public A getObject() throws Exception {
        System.out.println("getObject...");
        return new A();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}

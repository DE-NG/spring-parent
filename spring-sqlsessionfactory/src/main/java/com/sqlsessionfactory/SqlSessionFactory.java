package com.sqlsessionfactory;


/**
 * @author DENG-
 */
public class SqlSessionFactory {
    private Properties prop;
    public SqlSessionFactory(Properties prop) {
        this.prop = prop;
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "SqlSessionFactory{" +
                "prop=" + prop +
                '}';
    }
}

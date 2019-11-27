package com.sqlsessionfactory;


/**
 * @author DENG-
 */
public class SqlSessionFactoryCreator {
    private Properties prop;

    public SqlSessionFactoryCreator(Properties prop) {
        this.prop = prop;
    }

    public SqlSessionFactory create(){
        return new SqlSessionFactory(prop);
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "SqlSessionFactoryCreator{" +
                "prop=" + prop +
                '}';
    }
}

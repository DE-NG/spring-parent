package com.sqlsessionfactory;

/**
 * @author DENG-
 */
public class Properties {
    private String url;
    private String username;
    private String pwd;
    private String driverClassName;

    public Properties(String url, String username, String pwd, String driverClassName) {
        this.url = url;
        this.username = username;
        this.pwd = pwd;
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                ", driverClassName='" + driverClassName + '\'' +
                '}';
    }
}

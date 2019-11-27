package com.entity;

/**
 * @Author:DENG-
 * @Date:2019/10/30 19:17
 */
public class A {
    private Integer id;
    private String name;

    public A() {
    }

    public A(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "A{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

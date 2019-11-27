package com.entity;

/**
 * @Author:DENG-
 * @Date:2019/10/30 19:17
 */
public class B {
    private Integer id;
    private String name;

    public B() {
    }

    public B(String name){
        this.name = name;
    }

    public B(Integer id, String name) {
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
        return "B{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

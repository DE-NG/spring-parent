package com.entity;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;
import java.math.BigDecimal;

/**
 * @Author:DENG-
 * @Date:2019/11/13 11:48
 */
public class UserInfo {
    private Integer id;
    @NotEmpty(message = "名字不能为空")
    private String username;

    @Min(value = 18,message = "年龄必须在18-40之间")
    @Max(value = 40,message = "年龄必须在18-40之间")
   // @Digits(integer = 3, fraction = 999)
    private Integer age;

    @DecimalMin(value = "0",message = "必须大于或等于0")
    private BigDecimal salary;

    @Length(max = 11,min = 11,message = "手机号码要为11位")
    @NotEmpty(message = "不能为空")
    private String phone;

    @Email
    @NotEmpty(message = "不能为空")
    private String email;

    public UserInfo() {
    }

    public UserInfo(Integer id, String username, Integer age, BigDecimal salary, String phone, String email) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

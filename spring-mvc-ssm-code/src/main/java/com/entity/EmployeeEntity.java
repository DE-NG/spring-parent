package com.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author:DENG-
 * @Date:2019/11/25 11:37
 */
@Data
public class EmployeeEntity {
    private String username;
    private Date hiredate;
}

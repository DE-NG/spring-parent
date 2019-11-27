package com.formatter;

import com.entity.Employee;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

/**
 * @Author:DENG-
 * @Date:2019/11/12 14:50
 */
public class EmpFormatter implements Formatter<Employee> {
    @Override
    public Employee parse(String text, Locale locale) throws ParseException {
        String[] data = text.split(",");
        Employee employee = new Employee();
        employee.setUsername(data[0]);
        employee.setDeptid(Integer.parseInt(data[1]));

        return employee;
    }

    @Override
    public String print(Employee object, Locale locale) {
        return null;
    }
}

package com.controller;

import com.formatter.EmpFormatter;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * @Author:DENG-
 * @Date:2019/11/12 14:46
 */
@ControllerAdvice
public class MyControllerAdvice {
    @InitBinder
    public void xxx(WebDataBinder dataBinder){
        DateFormatter dateFormatter = new DateFormatter();
        dateFormatter.setPattern("yyyy/mm/dd");
        dataBinder.addCustomFormatter(dateFormatter);
       // dataBinder.addCustomFormatter(new EmpFormatter());
    }
}

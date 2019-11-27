package com.controller;

import com.entity.Employee;
import com.service.EmployeeService;
import com.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.util.Date;

/**
 * @Author:DENG-
 * @Date:2019/11/11 19:18
 */
@Controller
public class EmployeeInsertServlet {

    @Autowired
    private ApplicationContext context;

//    @InitBinder
//    public void xxx(WebDataBinder dataBinder){
//        dataBinder.addCustomFormatter(new DateFormatter());
//    }

    @GetMapping("/")
    public String homePage(){
        return "index";
    }

    @GetMapping("/insert")
    public String insert(Employee employee){
        EmployeeServiceImpl service = context.getBean(EmployeeServiceImpl.class);
        int rows = service.insert(employee);
        System.out.println(rows);
        return "index";
    }

    @GetMapping("/simple/page/{pageNo}")
    public String index(@PathVariable("pageNo")int pageNo){
        System.out.println("debug-------" + pageNo);
        return "index";
    }

    @GetMapping("/date")
    public String dateFormat(Date date){
        System.out.println("debug-------" + date);
        return "index";
    }

    @GetMapping("/employee")
    public String receive(@RequestParam("xxx")Employee employee){
        System.out.println("debug-------------" + employee);
        return "index";
    }
}

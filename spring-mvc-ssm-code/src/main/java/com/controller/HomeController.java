package com.controller;

import com.entity.EmployeeEntity;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:DENG-
 * @Date:2019/11/25 11:44
 */
@Controller
public class HomeController {
    @Autowired
    private EmployeeService service;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<EmployeeEntity> list(@RequestParam(value = "pageNum",required = false,defaultValue = "1") int pageNum,
                                     @RequestParam(value = "pageSize",required = false,defaultValue = "2")int pageSize){
        return service.getAll(pageNum,pageSize);
    }
}

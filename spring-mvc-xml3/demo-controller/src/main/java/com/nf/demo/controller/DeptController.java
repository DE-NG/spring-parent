package com.nf.demo.controller;

import com.nf.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:DENG-
 * @Date:2019/11/21 11:13
 */
@Controller
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping("list")
    public String list(){
        return "/dept/list";
    }

    @RequestMapping("/delete")
    public String delete(int id){
        deptService.deleteById(id);
        return "redirect:/dept/list";
    }
}

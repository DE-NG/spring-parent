package com.controller;

import com.entity.DeptVO;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:DENG-
 * @Date:2019/11/18 11:34
 */
@Controller
public class DeptController {
    @Autowired
    private DeptService service;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<DeptVO> list(){
        List<DeptVO> result = service.getAll();
        return result;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public String insert(@RequestBody DeptVO deptVO){
        int rows = service.insert(deptVO);
        String msg = "";
        if (rows > 0){
            msg = "添加成功";
        }else {
            msg = "添加失败";
        }
        return msg;
    }
}

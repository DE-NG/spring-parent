package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:DENG-
 * @Date:2019/11/11 11:05
 */
@Controller
@RequestMapping("/demo")
public class HomeController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}

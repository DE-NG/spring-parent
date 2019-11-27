package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author:DENG-
 * @Date:2019/11/20 9:58
 */
@Controller
public class HomeController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String dologin(String username,String password,HttpSession session){
        if("admin".equals(username) && "123".equals(password)){
            session.setAttribute("username",username);
            return "index";
        }else {
            return "login";
        }
    }
}
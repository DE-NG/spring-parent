package com.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author:DENG-
 * @Date:2019/11/14 11:33
 */
@Controller
@RequestMapping("/view")
public class ViewController {
    @RequestMapping("/demo1")
    public String index1(){
        return "index";
    }

    @RequestMapping("/demo2")
    public String index2(HttpServletRequest request){
        return "forward:index";
    }

    @RequestMapping("/demo3")
    public ModelAndView index3(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping("/demo4")
    public String index4(){
        return "redirect:demo";
    }

    @RequestMapping("/demo5")
    public RedirectView index5(){
        RedirectView rv = new RedirectView("demo");
        return rv;
    }

    @RequestMapping("/demo")
    public String index(){
        return "index";
    }

}

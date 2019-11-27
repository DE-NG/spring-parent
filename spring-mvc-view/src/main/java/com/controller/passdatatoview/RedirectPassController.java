package com.controller.passdatatoview;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;

/**
 * @Author:DENG-
 * @Date:2019/11/14 14:55
 */
@Controller
@RequestMapping("/redirect")
public class RedirectPassController {
    @RequestMapping("/demo1")
    public String index1(){
        return "redirect:demo2?d=DENG";
    }

    @RequestMapping("demo2")
    public String index2(String d, Model model){
        model.addAttribute("d",d);
        return "index";
    }

    @RequestMapping("/demo3")
    public String index3(HttpSession session){
        session.setAttribute("d","DENG");
        return "redirect:demo4";
    }

    @RequestMapping("/demo4")
    public String index4(){
        return "index";
    }

    @RequestMapping("/demo5")
    public String index5(RedirectAttributes redirectAttributes){
        redirectAttributes.addAttribute("d","DENG");
        redirectAttributes.addFlashAttribute("d","DENG");
        return "redirect:demo6";
    }

    @RequestMapping("/demo6")
    public String index6(){
        return "index";
    }
}

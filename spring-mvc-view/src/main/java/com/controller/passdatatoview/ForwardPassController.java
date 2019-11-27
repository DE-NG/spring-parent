package com.controller.passdatatoview;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Author:DENG-
 * @Date:2019/11/14 14:48
 */
@Controller
@RequestMapping("/forward")
public class ForwardPassController {
    @RequestMapping("/demo1")
    public String index1(HttpServletRequest request){
        request.setAttribute("d","DENG");
        return "index";
    }

    @RequestMapping("/demo2")
    public ModelAndView index2(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("d","DENG");
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping("/demo3")
    public String index3(Model model){
        model.addAttribute("d","DENG");
        return "index";
    }

    @RequestMapping("/demo4")
    public String index4(ModelMap modelMap){
        modelMap.addAttribute("d","DENG");
        return "index";
    }

    @RequestMapping("/demo5")
    public String index5(Map<String,Object> map){
        map.put("d","DENG");
        return "index";
    }
}

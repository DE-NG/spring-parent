package com.controller;

import com.entity.UserInfo;
import com.service.UserInfoService;
import com.service.impl.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

/**
 * @Author:DENG-
 * @Date:2019/11/13 12:03
 */
@Controller
public class UserInfoController {
    @Autowired
    private UserInfoService service;

    @RequestMapping("/index")
    public String index(){
        return "userinfo";
    }

    @RequestMapping("/insert")
    public ModelAndView insert(@Valid UserInfo userInfo, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();
        if (bindingResult.hasErrors()){
            List<FieldError> errors = bindingResult.getFieldErrors();
            for (FieldError error : errors) {
                modelAndView.addObject(error.getField(),error.getDefaultMessage());
            }
            modelAndView.setViewName("userinfo");
        }else {
            int rows = service.insert(userInfo);
            System.out.println(rows);
            modelAndView.setViewName("succeed");
        }
        return modelAndView;
    }
}

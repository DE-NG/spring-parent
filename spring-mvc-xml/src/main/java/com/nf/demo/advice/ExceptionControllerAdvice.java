package com.nf.demo.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author:DENG-
 * @Date:2019/11/21 11:30
 */
@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    public String handleRuntime(){
        return "error";
    }
}

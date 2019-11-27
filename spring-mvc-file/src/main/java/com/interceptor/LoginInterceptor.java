package com.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author:DENG-
 * @Date:2019/11/20 19:56
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        if(username != null){
            return true;
        }else {
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
            return false;
        }
    }
}

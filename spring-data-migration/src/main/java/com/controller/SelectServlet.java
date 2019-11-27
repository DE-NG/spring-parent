package com.controller;

import com.entity.A;
import com.github.pagehelper.PageInfo;
import com.service.impl.ServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author:DENG-
 * @Date:2019/10/30 21:22
 */
@WebServlet("/index")
public class SelectServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());
       // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ServiceImpl service = context.getBean("serviceImpl", ServiceImpl.class);
        int pageNum = Integer.parseInt(req.getParameter("pageNum"));
        int pageSize = Integer.parseInt(req.getParameter("pageSize"));
        List<A> result = service.getAll(pageNum,pageSize);
        PageInfo pageInfo = new PageInfo(result,3);
        req.setAttribute("pageInfo",pageInfo);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}

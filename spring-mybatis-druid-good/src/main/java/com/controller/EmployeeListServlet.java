package com.controller;

import com.entity.Employee;
import com.github.pagehelper.PageInfo;
import com.service.EmployeeService;
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
 * @author DENG-
 */
@WebServlet("/index")
public class EmployeeListServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int pageNum = Integer.parseInt(req.getParameter("page"));
        int pageSize = Integer.parseInt(req.getParameter("pageSize"));
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());
        EmployeeService service =context.getBean("employeeService",EmployeeService.class);
        List<Employee> list = service.getAll(pageNum,pageSize);
        PageInfo pageInfo = new PageInfo(list,3);
        req.setAttribute("pageInfo",pageInfo);
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req,resp);
    }
}

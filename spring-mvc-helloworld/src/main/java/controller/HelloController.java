package controller;

import hello.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:DENG-
 * @Date:2019/11/7 20:19
 */
//@Component
@Controller
public class HelloController {

    @Autowired
    private ApplicationContext context;

    @RequestMapping("/index")
    public static String handle(){
        return "hello";
        //return "WEB-INF/jsp/hello.jsp";
    }

    @RequestMapping("/index2.html")
    public HelloWorld handle2(){
        System.out.println("____________-");
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setViewName("hello");
        String[] strings = context.getBeanDefinitionNames();
        for (String string : strings) {
            System.out.println("Bean:" + string);
        }
        return helloWorld;
    }
}

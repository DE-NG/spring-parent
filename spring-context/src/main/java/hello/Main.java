package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author DENG-
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        EmployeeDao employeeDao = (EmployeeDao) context.getBean("first");
        EmployeeDao employeeDao1 = context.getBean("first",EmployeeDao.class);
        System.out.println(employeeDao);
        System.out.println(employeeDao1);
    }
}

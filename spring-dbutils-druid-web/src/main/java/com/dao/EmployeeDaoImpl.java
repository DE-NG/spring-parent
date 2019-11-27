package com.dao;

import com.entity.Employee;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

/**
 * @author DENG-
 */
public class EmployeeDaoImpl implements EmployeeDao {
    QueryRunner queryRunner;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    @Override
    public List<Employee> getListEmployee() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        QueryRunner queryRunner = context.getBean("queryRunner",QueryRunner.class);
        String sql = "select * from employee";
        BeanListHandler<Employee> handler = new BeanListHandler(Employee.class);
        try {
            return queryRunner.query(sql,handler);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
        List<Employee> list = employeeDao.getListEmployee();
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}

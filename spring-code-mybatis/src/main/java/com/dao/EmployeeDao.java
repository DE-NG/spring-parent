package com.dao;

import com.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:DENG-
 * @Date:2019/11/6 15:13
 */
public interface EmployeeDao {
    void delete();

    List<Employee> getAll(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
}

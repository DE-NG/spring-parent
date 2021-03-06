package com.nf.demo.dao;

import com.nf.demo.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:DENG-
 * @Date:2019/11/21 8:48
 */
public interface EmployeeDao {
    List<EmployeeEntity> getAll(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);

    void insert(EmployeeEntity employeeEntity);

    void deleteByDeptId(int deptid);
}

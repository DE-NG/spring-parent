package com.dao;

import com.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:DENG-
 * @Date:2019/11/25 11:38
 */
public interface EmployeeDao {
    List<EmployeeEntity> getAll(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);

}

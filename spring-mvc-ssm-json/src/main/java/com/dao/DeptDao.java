package com.dao;

import com.entity.DeptVO;

import java.util.List;

/**
 * @Author:DENG-
 * @Date:2019/11/18 11:26
 */
public interface DeptDao {
    List<DeptVO> getAll();

    int insert(DeptVO deptVO);
}

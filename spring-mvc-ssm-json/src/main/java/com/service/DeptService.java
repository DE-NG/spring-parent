package com.service;

import com.entity.DeptVO;

import java.util.List;

/**
 * @Author:DENG-
 * @Date:2019/11/18 11:29
 */
public interface DeptService {
    List<DeptVO> getAll();

    int insert(DeptVO deptVO);
}

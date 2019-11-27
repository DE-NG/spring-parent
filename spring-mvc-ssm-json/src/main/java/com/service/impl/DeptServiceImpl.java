package com.service.impl;

import com.dao.DeptDao;
import com.entity.DeptVO;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:DENG-
 * @Date:2019/11/18 11:32
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public List<DeptVO> getAll() {
        return deptDao.getAll();
    }

    @Override
    public int insert(DeptVO deptVO) {
        return deptDao.insert(deptVO);
    }
}

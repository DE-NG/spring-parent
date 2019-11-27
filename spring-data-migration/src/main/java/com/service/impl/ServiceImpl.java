package com.service.impl;

import com.dao.ADao;
import com.dao.BDao;
import com.entity.A;
import com.entity.B;

import java.util.List;

/**
 * @Author:DENG-
 * @Date:2019/10/30 19:40
 */
public class ServiceImpl {
    private ADao aDao;
    private BDao bDao;

    public void setbDao(BDao bDao) {
        this.bDao = bDao;
    }

    public void setDao(ADao aDao) {
        this.aDao = aDao;
    }

    public void migration(int id){
        A a = aDao.getById(id);
        String name = a.getName();
        B b = new B(name);
        int rows = aDao.deleteById(id);
        int rows2 = bDao.insert(b);
    }

    public List<A> getAll(int pageNum,int pageSize){
        return aDao.getAll(pageNum,pageSize);
    }


}

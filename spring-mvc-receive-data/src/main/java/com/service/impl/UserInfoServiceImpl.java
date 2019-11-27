package com.service.impl;

import com.dao.UserInfoDao;
import com.entity.UserInfo;
import com.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:DENG-
 * @Date:2019/11/13 12:00
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public int insert(UserInfo userInfo) {
        int rows = userInfoDao.insert(userInfo);
        return rows;
    }
}

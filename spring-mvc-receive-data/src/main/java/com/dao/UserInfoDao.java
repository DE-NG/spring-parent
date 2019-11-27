package com.dao;

import com.entity.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * @Author:DENG-
 * @Date:2019/11/13 11:58
 */
@Repository
public interface UserInfoDao {
    int insert(UserInfo userInfo);
}

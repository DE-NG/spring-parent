package com.dao;

import com.entity.A;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:DENG-
 * @Date:2019/10/30 19:28
 */
public interface ADao {

    int deleteById(int id);

    A getById(int id);

    List<A> getAll(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
}

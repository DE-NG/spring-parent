package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author DENG-
 */
public class DeptDao {
    public int deleteDeptById(Connection conn,int id){
        int num = 0;
        String sql = "delete from dept where id=" + id;
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            num = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  num;
    }
}

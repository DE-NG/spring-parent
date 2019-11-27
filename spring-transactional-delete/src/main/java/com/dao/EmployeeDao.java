package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author DENG-
 */
public class EmployeeDao {
    public int deleteEmpsByDeptId(Connection conn,int deptid){
        int num = 0;
        String sql = "delete from employee where deptid=" + deptid;
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            num = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  num;
    }
}

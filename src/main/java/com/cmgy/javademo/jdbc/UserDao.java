package com.cmgy.javademo.jdbc;

import java.sql.SQLException;
import java.sql.Statement;

public class UserDao extends BaseDao {

    public void insertWithName(String userName){
        try {
            String sql = "insert into t_user (user_name) values ( '" + userName + "');";
            Statement statement = conn.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
        }

    }
}

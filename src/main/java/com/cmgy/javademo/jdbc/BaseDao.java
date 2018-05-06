package com.cmgy.javademo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {
    protected static Connection conn;

    private static final String URL = "jdbc:mysql://localhost:3306/sampledb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("class is not existed");
        } catch (SQLException e) {
            System.out.println("can not get connection");
        }
    }


}

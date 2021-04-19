package com.lifeng.finance.demo.utils.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DateBase {
    public static final String URL = "jdbc:mysql://localhost:3306/finance?characterEncoding=utf8";
    public static final String USER = "root";
    public static final String PASSWORD = "19950213";
    private static Connection conn = null;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }
}

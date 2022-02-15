package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static String url = "jdbc:postgresql://localhost:5432/oop";
    private static String user = "postgres";
    private static String password = "123";
    static Connection connection;

    public static Connection getConnection() throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
        return connection;
    }


}

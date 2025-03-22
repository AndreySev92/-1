package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest"; // Replace with your database name
    private static final String USER = "root"; // Replace with your MySQL username
    private static final String PASSWORD = "root"; // Replace with your MySQL password
    private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver"; // MySQL JDBC Driver

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER_CLASS);

            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Statement getStatement() {
        try {
            return getConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

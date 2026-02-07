package com.mysqlpractice.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/mysqlpractice";

    public static Connection getConnection() throws SQLException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter DB Username: ");
        String user = sc.nextLine();

        System.out.print("Enter DB Password: ");
        String password = sc.nextLine();

        return DriverManager.getConnection(URL, user, password);
    }
}

package com.CSVDataHandling.AdvancedProblems;

import java.io.FileWriter;
import java.sql.*;

public class GenerateCSVReportFromDatabase {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company";
        String user = "root";
        String password = "password";

        String query = "SELECT emp_id, name, department, salary FROM employees";

        try(
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            FileWriter writer = new FileWriter("employee_report.csv")
        ) {
            writer.write("Employee ID,Name,Department,Salary\n");

            while(rs.next()) {
                writer.write(
                    rs.getInt("emp_id") + "," +
                    rs.getString("name") + "," +
                    rs.getString("department") + "," +
                    rs.getDouble("salary") + "\n"
                );
            }

            System.out.println("CSV report generated successfully.");

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

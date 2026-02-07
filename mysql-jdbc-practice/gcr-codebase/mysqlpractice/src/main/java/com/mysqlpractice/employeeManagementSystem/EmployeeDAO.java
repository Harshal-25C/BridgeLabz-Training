package com.mysqlpractice.employeeManagementSystem;

import com.mysqlpractice.util.DBConnection;
import java.sql.*;

public class EmployeeDAO {

    public void addEmployee(Employee emp) throws SQLException {
        String sql = "INSERT INTO employee(emp_name, salary) VALUES (?, ?)";

        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, emp.getName());
        ps.setDouble(2, emp.getSalary());

        ps.executeUpdate();
        System.out.println("Employee added successfully");
        con.close();
    }

    public void viewEmployees() throws SQLException {
        String sql = "SELECT * FROM employee";

        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            System.out.println(
                rs.getInt("emp_id") + " | " +
                rs.getString("emp_name") + " | " +
                rs.getDouble("salary")
            );
        }
        con.close();
    }

    public void updateSalary(int emp_id, double salary) throws SQLException {
        String sql = "UPDATE employee SET salary=? WHERE emp_id=?";

        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setDouble(1, salary);
        ps.setInt(2, emp_id);

        ps.executeUpdate();
        System.out.println("Salary updated");
        con.close();
    }

    public void deleteEmployee(int emp_id) throws SQLException {
        String sql = "DELETE FROM employee WHERE emp_id=?";

        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, emp_id);
        ps.executeUpdate();
        System.out.println("Employee deleted");
        con.close();
    }

    public void searchByName(String emp_name) throws SQLException {
        String sql = "SELECT * FROM employee WHERE emp_name LIKE ?";

        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, "%" + emp_name + "%");
        ResultSet rs = ps.executeQuery();

        while(rs.next()) {
            System.out.println(
                rs.getInt("emp_id") + " | " +
                rs.getString("emp_name") + " | " +
                rs.getDouble("salary")
            );
        }
        con.close();
    }
}

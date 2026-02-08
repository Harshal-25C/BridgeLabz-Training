package com.mysqlScenarioPractice.PatientManagement;

import java.sql.*;
import com.mysqlScenarioPractice.util.DBConnection;

public class PatientDAO {

    public boolean isPatientExists(String phone, String email) throws SQLException {
        String sql = "SELECT id FROM patients WHERE phone=? OR email=?";
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
        ps.setString(1, phone);
        ps.setString(2, email);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    public void registerPatient(Patient p) throws SQLException {
        if (isPatientExists(p.getPhone(), p.getEmail())) {
            System.out.println("Patient already exists!");
            return;
        }

        String sql = """
            INSERT INTO patients(name, dob, phone, email, address, bloodGroup)
            VALUES (?, ?, ?, ?, ?, ?)
            """;

        PreparedStatement ps =
            DBConnection.getConnection().prepareStatement(sql);

        ps.setString(1, p.getName());
        ps.setString(2, p.getDob());
        ps.setString(3, p.getPhone());
        ps.setString(4, p.getEmail());
        ps.setString(5, p.getAddress());
        ps.setString(6, p.getBloodGroup());

        ps.executeUpdate();
        System.out.println("Patient registered successfully");
    }
    
    public void updatePatient(int id, String address) throws SQLException {
        String sql = "UPDATE patients SET address=? WHERE id=?";
        PreparedStatement ps =
            DBConnection.getConnection().prepareStatement(sql);
        ps.setString(1, address);
        ps.setInt(2, id);
        ps.executeUpdate();
        System.out.println("Patient updated");
    }
    
    public void searchPatientByName(String name) throws SQLException {
        String sql = "SELECT * FROM patients WHERE name LIKE ?";
        PreparedStatement ps =
            DBConnection.getConnection().prepareStatement(sql);
        ps.setString(1, "%" + name + "%");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(
                rs.getInt("id") + " | " +
                rs.getString("name") + " | " +
                rs.getString("phone"));
        }
    }
    
    public void viewVisitHistory(int patientId) throws SQLException {
        String sql = """
            SELECT v.visit_date, d.name, v.diagnosis
            FROM visits v
            JOIN doctors d ON v.doctor_id = d.id
            WHERE v.patient_id = ?
            ORDER BY v.visit_date
            """;

        PreparedStatement ps =
            DBConnection.getConnection().prepareStatement(sql);
        ps.setInt(1, patientId);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(
                rs.getDate("visit_date") + " | " +
                rs.getString("name") + " | " +
                rs.getString("diagnosis"));
        }
    }
}

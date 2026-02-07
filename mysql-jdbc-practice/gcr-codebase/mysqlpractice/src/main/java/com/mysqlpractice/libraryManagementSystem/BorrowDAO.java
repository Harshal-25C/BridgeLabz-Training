package com.mysqlpractice.libraryManagementSystem;

import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import com.mysqlpractice.util.DBConnection;

public class BorrowDAO {

    public void borrowBook(String student, int bookId) throws Exception {
        Connection con = DBConnection.getConnection();
        con.setAutoCommit(false);

        try{
            PreparedStatement ps1 = con.prepareStatement("UPDATE book SET quantity = quantity - 1 WHERE book_id=? AND quantity>0");
            ps1.setInt(1, bookId);
            
            if(ps1.executeUpdate() == 0)
                throw new RuntimeException("Book not available");

            PreparedStatement ps2 =
                con.prepareStatement("INSERT INTO borrow(student_name,book_id,borrow_date) VALUES(?,?,?)");
            ps2.setString(1, student);
            ps2.setInt(2, bookId);
            ps2.setDate(3, Date.valueOf(LocalDate.now()));
            ps2.executeUpdate();

            con.commit();
            System.out.println("Book borrowed successfully");

        }catch (Exception e) {
            con.rollback();
            throw e;
        }
    }

    public void returnBook(int borrowId) throws Exception {
        Connection con = DBConnection.getConnection();
        con.setAutoCommit(false);

        PreparedStatement ps =
            con.prepareStatement("SELECT book_id, borrow_date FROM borrow WHERE borrow_id=?");
        ps.setInt(1, borrowId);

        ResultSet rs = ps.executeQuery();
        if(!rs.next()) {
            System.out.println("Invalid borrow id");
            return;
        }

        int bookId = rs.getInt(1);
        LocalDate borrowDate = rs.getDate(2).toLocalDate();

        long days = ChronoUnit.DAYS.between(borrowDate, LocalDate.now());
        long fine = days > 7 ? (days - 7) * 10 : 0;

        PreparedStatement ps2 = con.prepareStatement("UPDATE borrow SET return_date=? WHERE borrow_id=?");
        ps2.setDate(1, Date.valueOf(LocalDate.now()));
        ps2.setInt(2, borrowId);
        ps2.executeUpdate();

        PreparedStatement ps3 = con.prepareStatement("UPDATE book SET quantity = quantity + 1 WHERE book_id=?");
        ps3.setInt(1, bookId);
        ps3.executeUpdate();

        con.commit();
        System.out.println("Returned. Fine = ₹" + fine);
    }
}

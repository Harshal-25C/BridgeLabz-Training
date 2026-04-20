package com.mysqlpractice.libraryManagementSystem;


import java.sql.*;
import com.mysqlpractice.util.DBConnection;

public class BookDAO {

    public void addBook(String title, String author, int qty) throws Exception {
        String sql = "INSERT INTO book(title,author,quantity) VALUES(?,?,?)";
        try(Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, title);
            ps.setString(2, author);
            ps.setInt(3, qty);
            ps.executeUpdate();
        }
    }

    public void searchBooks(String title, String author) throws Exception {
        String sql = "SELECT * FROM book WHERE title LIKE ? AND author LIKE ?";
        try(Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + title + "%");
            ps.setString(2, "%" + author + "%");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(
                        rs.getInt("book_id") + " | " +
                        rs.getString("title") + " | " +
                        rs.getString("author") + " | Qty: " +
                        rs.getInt("quantity"));
            }
        }
    }
}

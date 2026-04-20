package com.mysqlpractice.bankingTransactionManagement;

import com.mysqlpractice.util.DBConnection;
import java.sql.*;

public class BankingDAO {

    public void transferMoney(int from, int to, double amount) throws SQLException {
        Connection con = DBConnection.getConnection();
        con.setAutoCommit(false);

        try{
            PreparedStatement debit = con.prepareStatement(
                    "UPDATE account SET balance = balance - ? WHERE account_id = ?");

            PreparedStatement credit = con.prepareStatement(
                    "UPDATE account SET balance = balance + ? WHERE account_id = ?");

            debit.setDouble(1, amount);
            debit.setInt(2, from);
            debit.executeUpdate();

            credit.setDouble(1, amount);
            credit.setInt(2, to);
            credit.executeUpdate();

            PreparedStatement history = con.prepareStatement(
                    "INSERT INTO transaction_history(from_account,to_account,amount) VALUES (?,?,?)");

            history.setInt(1, from);
            history.setInt(2, to);
            history.setDouble(3, amount);
            history.executeUpdate();

            con.commit();
            System.out.println("Transaction successful");

        }catch (Exception e) {
            con.rollback();
            System.out.println("Transaction failed, rolled back");
        }finally {
            con.close();
        }
    }

    public void checkBalance(int accountId) throws SQLException {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT balance FROM account WHERE account_id=?");

        ps.setInt(1, accountId);
        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            System.out.println("Balance: " + rs.getDouble("balance"));
        }
        con.close();
    }

    public void transactionHistory() throws SQLException {
        Connection con = DBConnection.getConnection();
        ResultSet rs = con.createStatement().executeQuery("SELECT * FROM transaction_history");

        while(rs.next()) {
            System.out.println(
                rs.getInt("tx_id") + " | " +
                rs.getInt("from_account") + " -> " +
                rs.getInt("to_account") + " | " +
                rs.getDouble("amount") + " | " +
                rs.getTimestamp("tx_date"));
        }
        con.close();
    }
}

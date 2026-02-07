package com.mysqlpractice.bankingTransactionManagement;

import java.sql.SQLException;
import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) throws SQLException {
        BankingDAO dao = new BankingDAO();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n1.Transfer  2.Check Balance  3.History  4.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("From Account: ");
                    int from = sc.nextInt();
                    System.out.print("To Account: ");
                    int to = sc.nextInt();
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    dao.transferMoney(from, to, amt);
                    break;

                case 2:
                    System.out.print("Account ID: ");
                    dao.checkBalance(sc.nextInt());
                    break;

                case 3:
                    dao.transactionHistory();
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}

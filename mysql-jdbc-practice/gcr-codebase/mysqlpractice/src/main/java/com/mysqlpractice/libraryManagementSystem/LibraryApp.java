package com.mysqlpractice.libraryManagementSystem;

import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BookDAO bookDAO = new BookDAO();
        BorrowDAO borrowDAO = new BorrowDAO();

        while (true) {
            System.out.println("""
                1. Add Book
                2. Search Book
                3. Borrow Book
                4. Return Book
                5. Exit
                """);

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Title: ");
                    String t = sc.nextLine();
                    System.out.print("Author: ");
                    String a = sc.nextLine();
                    System.out.print("Qty: ");
                    int q = sc.nextInt();
                    bookDAO.addBook(t, a, q);
                }
                case 2 -> {
                    System.out.print("Title filter: ");
                    String t = sc.nextLine();
                    System.out.print("Author filter: ");
                    String a = sc.nextLine();
                    bookDAO.searchBooks(t, a);
                }
                case 3 -> {
                    System.out.print("Student name: ");
                    String s = sc.nextLine();
                    System.out.print("Book ID: ");
                    int id = sc.nextInt();
                    borrowDAO.borrowBook(s, id);
                }
                case 4 -> {
                    System.out.print("Borrow ID: ");
                    int id = sc.nextInt();
                    borrowDAO.returnBook(id);
                }
                case 5 -> System.exit(0);
            }
        }
    }
}


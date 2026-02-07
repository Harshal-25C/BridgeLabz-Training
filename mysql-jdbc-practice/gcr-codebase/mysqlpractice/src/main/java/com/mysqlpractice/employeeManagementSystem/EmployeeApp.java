package com.mysqlpractice.employeeManagementSystem;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) throws SQLException {
        EmployeeDAO dao = new EmployeeDAO();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Search by Name");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Salary: ");
                    double sal = sc.nextDouble();
                    dao.addEmployee(new Employee(name, sal));
                    break;

                case 2:
                    dao.viewEmployees();
                    break;

                case 3:
                    System.out.print("Employee ID: ");
                    int id = sc.nextInt();
                    System.out.print("New Salary: ");
                    double s = sc.nextDouble();
                    dao.updateSalary(id, s);
                    break;

                case 4:
                    System.out.print("Employee ID: ");
                    dao.deleteEmployee(sc.nextInt());
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Name to search: ");
                    dao.searchByName(sc.nextLine());
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}

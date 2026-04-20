package com.AssessmentLevelPrograms.M1_mock;

import java.util.*;

class Employee {
    private int employeeId;
    private String designation;

    public Employee(int employeeId, String designation) {
        this.employeeId = employeeId;
        this.designation = designation;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

class EmployeeManagement {

    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(int employeeId, String designation) {
        employeeList.add(new Employee(employeeId, designation));
    }

    public void updateDesignation(int employeeId, String newDesignation) {
        for(Employee emp : employeeList) {
            if(emp.getEmployeeId() == employeeId) {
                emp.setDesignation(newDesignation);
                System.out.println(employeeId + " " + newDesignation);
                break;
            }
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManagement management = new EmployeeManagement();

        System.out.println("Enter command, Employee ID & Designation: ");
        while(sc.hasNext()) {

            String command = sc.next(); // char ch = sc.next().charAt(0);

            if(command.equals("A")) {
                int id = sc.nextInt();
                String designation = sc.nextLine().trim(); 
                management.addEmployee(id, designation);

            }else if (command.equals("U")) {
                int id = sc.nextInt();
                String newDesignation = sc.nextLine().trim();
                management.updateDesignation(id, newDesignation);
            }
        }

    }
}

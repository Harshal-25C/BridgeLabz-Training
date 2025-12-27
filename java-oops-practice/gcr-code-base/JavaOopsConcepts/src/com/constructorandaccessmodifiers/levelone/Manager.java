package com.constructorandaccessmodifiers.levelone;

public class Manager extends Employee{

    public Manager(int employeeID, String department, double salary){
        super(employeeID, department, salary);
    }

    public void displayManagerDetails(){
        System.out.println("Employee ID: " + employeeID); //public
        System.out.println("Department: " + department);  //protected
        System.out.println("Salary: " + getSalary());     //private via method
    }

    public static void main(String[] args){
        Manager mgr = new Manager(501, "IT", 80000);
        mgr.displayManagerDetails();
        mgr.setSalary(90000);
        System.out.println("Updated Salary: " + mgr.getSalary());
    }
}

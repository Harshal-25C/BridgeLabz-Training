package com.constructorandaccessmodifiers.levelone;

public class Employee{

	//public variable
    public int employeeID;

    //protected variable
    protected String department;

    //private variable
    private double salary;

    //constructor
    public Employee(int employeeID, String department, double salary){
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    //public method to modify salary
    public void setSalary(double salary){
        this.salary = salary;
    }

    //public method to access salary
    public double getSalary(){
        return salary;
    }

}

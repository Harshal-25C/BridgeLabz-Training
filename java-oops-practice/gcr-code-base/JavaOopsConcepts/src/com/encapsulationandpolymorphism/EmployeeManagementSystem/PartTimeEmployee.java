package com.encapsulationandpolymorphism.EmployeeManagementSystem;

public class PartTimeEmployee extends Employee implements Department{
    private int hoursWorked;
    private double hourlyRate;

    PartTimeEmployee(int id, String name, int hours, double rate){
        super(id, name, 0);
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }

    public void assignDepartment(String dept){
        department = dept;
    }

    public String getDepartmentDetails(){
        return department;
    }
}

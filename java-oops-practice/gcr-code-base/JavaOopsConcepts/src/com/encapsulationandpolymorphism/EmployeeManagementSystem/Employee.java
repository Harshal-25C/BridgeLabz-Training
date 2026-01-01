package com.encapsulationandpolymorphism.EmployeeManagementSystem;

abstract class Employee{
	private int employeeId;
    private String name;
    private double baseSalary;
    protected String department;

    //Constructor to initialize common fields
    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    //Getter and Setter methods (Encapsulation)
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    //Abstract method for salary calculation
    abstract double calculateSalary();

    //Concrete method to display details
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + calculateSalary());
        System.out.println("------------------------");
    }
}

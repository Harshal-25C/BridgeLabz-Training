package com.mysqlpractice.employeeManagementSystem;

public class Employee {
    private int emp_id;
    private String emp_name;
    private double salary;

    public Employee() {}

    public Employee(String name, double salary) {
        this.emp_name = name;
        this.salary = salary;
    }

    public int getId() { return emp_id; }
    public String getName() { return emp_name; }
    public double getSalary() { return salary; }

    public void setId(int id) { this.emp_id = id; }
    public void setName(String name) { this.emp_name = name; }
    public void setSalary(double salary) { this.salary = salary; }
}

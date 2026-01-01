package com.encapsulationandpolymorphism.EmployeeManagementSystem;

public class FullTimeEmployee extends Employee implements Department{
	FullTimeEmployee(int id, String name, double salary){
        super(id, name, salary);
    }

    public double calculateSalary(){
        return getBaseSalary();
    }

    public void assignDepartment(String dept){
        department = dept;
    }

    public String getDepartmentDetails(){
        return department;
    }
}

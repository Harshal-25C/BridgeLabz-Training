package com.Collectors;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeSalaryStats {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Harshal", "IT", 70000),
                new Employee("Amit", "HR", 50000),
                new Employee("Neha", "IT", 80000),
                new Employee("Zoya", "Finance", 65000),
                new Employee("Rahul", "HR", 52000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
                         .collect(Collectors.groupingBy(
                                 Employee::getDepartment,
                                 Collectors.averagingDouble(Employee::getSalary)
                         ));

        avgSalaryByDept.forEach((dept, avgSalary) -> System.out.println(dept + " → " + avgSalary));
    }
}

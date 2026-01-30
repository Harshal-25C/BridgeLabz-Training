package com.BasicScenarios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalaryMoreThan25k {
	public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Harshal", 23, "Male", "IT", 2022, 50000),
                new Employee(2, "Neha", 25, "Female", "HR", 2021, 38000),
                new Employee(3, "Amit", 28, "Male", "Finance", 2020, 22000),
                new Employee(4, "Zoya", 26, "Female", "IT", 2023, 52000),
                new Employee(5, "Rahul", 30, "Male", "HR", 2019, 18500)
        );

/*      //1st Way

        List<Employee> moreSalary = employees.stream()
        		.filter(e -> e.getSalary() > 25000)
        		.collect(Collectors.toList());

        System.out.println("Employees whose salary is greater than 25000:");
        moreSalary.forEach(System.out::println);
        
*/     
        //Or this
        System.out.println("Employees whose salary is greater than 25000:");
        employees.stream().filter(e -> e.getSalary() > 25000).forEach(System.out::println);
    }
}

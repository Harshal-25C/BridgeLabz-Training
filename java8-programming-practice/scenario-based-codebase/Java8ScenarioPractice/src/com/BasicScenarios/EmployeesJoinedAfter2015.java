package com.BasicScenarios;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeesJoinedAfter2015 {
	public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Harshal", 23, "Male", "IT", 2014, 50000),
                new Employee(2, "Neha", 25, "Female", "HR", 2021, 45000),
                new Employee(3, "Amit", 28, "Male", "Finance", 2020, 60000),
                new Employee(4, "Zoya", 26, "Female", "IT", 2023, 52000),
                new Employee(5, "Rahul", 30, "Male", "HR", 2019, 58000),
                new Employee(5, "Anvii", 22, "Feale", "HR", 2012, 58000)
        );

        System.out.println("\nEmployees Joined After 2015:");
        employees.stream()
                 .filter(e -> e.getYearOfJoining() > 2015)
                 .map(Employee::getName)
                 .forEach(System.out::println);

    }
}

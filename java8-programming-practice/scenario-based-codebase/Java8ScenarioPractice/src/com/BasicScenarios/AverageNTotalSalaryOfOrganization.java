package com.BasicScenarios;

import java.util.*;
import java.util.stream.Collectors;

public class AverageNTotalSalaryOfOrganization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(
	            new Employee(1, "Harshal", 23, "Male", "IT", 2022, 50000),
	            new Employee(2, "Neha", 25, "Female", "HR", 2021, 45000),
	            new Employee(3, "Amit", 28, "Male", "Finance", 2020, 60000),
	            new Employee(4, "Zoya", 26, "Female", "IT", 2023, 52000),
	            new Employee(5, "Rahul", 30, "Male", "HR", 2019, 58000)
	        );
		
		DoubleSummaryStatistics salaryStats = employees.stream()
		                 .collect(Collectors.summarizingDouble(Employee::getSalary));

		System.out.println("Total Salary  : " + salaryStats.getSum());
		System.out.println("Average Salary: " + salaryStats.getAverage());

	}

}

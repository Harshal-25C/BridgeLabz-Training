package com.objectmodeling;
import java.util.*;

public class Department {

	String departmentName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String departmentName) {
        this.departmentName = departmentName;
    }

    void addEmployee(String name) {
        employees.add(new Employee(name));
    }

}

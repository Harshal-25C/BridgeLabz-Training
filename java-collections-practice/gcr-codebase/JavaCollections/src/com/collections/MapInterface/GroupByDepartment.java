package com.collections.MapInterface;
import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

class GroupByDepartment {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee e : employees) {
            departmentMap
                .computeIfAbsent(e.department, k -> new ArrayList<>())
                .add(e);
        }

        departmentMap.forEach((k, v) ->
                System.out.println(k + ": " + v));
    }
}

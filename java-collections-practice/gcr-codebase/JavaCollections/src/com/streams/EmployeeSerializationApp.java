package com.streams;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerializationApp {

    //Inner Employee class
    static class Employee implements Serializable {
        private static final long serialVersionUID = 1L;

        int id;
        String name;
        String department;
        double salary;

        Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "EmployeeId: " + id +
                   ", Name: " + name +
                   ", Department: " + department +
                   ", Salary: " + salary;
        }
    }

    public static void main(String[] args) {

        String fileName = "employees.dat";

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Harshal", "IT", 60000));
        employees.add(new Employee(102, "Ayush", "HR", 50000));
        employees.add(new Employee(103, "Devarshi", "Finance", 55000));

        //Serialization
        try(ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(employees);
            System.out.println("Employees serialized successfully.");

        }catch (IOException e) {
            System.out.println("Error during serialization.");
        }

        //Deserialization
        try(ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {

            List<Employee> empList = (List<Employee>) ois.readObject();

            System.out.println("\nDeserialized Employee Data:");
            for(Employee e:empList) {
                System.out.println(e);
            }

        }catch (IOException e) {
            System.out.println("Error during deserialization.");
        }catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }
    }
}
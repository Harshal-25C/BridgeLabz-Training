package com.StreamScenariosIntermediateProblems.AdvancedProblems;

import java.util.*;

public class Student {

    private int id;
    private String name;
    private String firstName;
    private int age;
    private String gender;
    private String city;
    private String department;
    private int rank;
    private List<String> contacts;

    public Student(int id, String name, String firstName, int age,
                   String gender, String city, String department,
                   int rank, List<String> contacts) {

        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.department = department;
        this.rank = rank;
        this.contacts = contacts;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getFirstName() { return firstName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getCity() { return city; }
    public String getDepartment() { return department; }
    public int getRank() { return rank; }
    public List<String> getContacts() { return contacts; }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", rank=" + rank +
                '}';
    }
}


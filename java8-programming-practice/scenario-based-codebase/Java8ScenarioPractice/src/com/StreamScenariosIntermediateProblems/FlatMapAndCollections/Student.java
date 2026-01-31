package com.StreamScenariosIntermediateProblems.FlatMapAndCollections;

import java.util.*;

public class Student {

    private int id;
    private String name;
    private String firstName;
    private int age;
    private String gender;
    private String city;
    private double rank;
    private List<String> contacts;

    public Student(int id, String name, String firstName, int age,
                   String gender, String city, double rank, List<String> contacts) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.rank = rank;
        this.contacts = contacts;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getFirstName() { return firstName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getCity() { return city; }
    public double getRank() { return rank; }
    public List<String> getContacts() { return contacts; }
}

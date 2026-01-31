package com.StreamScenariosIntermediateProblems.FilteringAndMapping;

public class Student {

    int id;
    String firstName;
    int age;
    String gender;
    String city;
    int rank;
    String department;
    String contacts;

    public Student(int id, String firstName, int age, String gender,
                   String city, int rank, String department, String contacts) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.rank = rank;
        this.department = department;
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return id + " | " + firstName + " | " + age + " | " +
               gender + " | " + city + " | " + rank + " | " + department;
    }
}

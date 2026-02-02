package com.StreamScenariosIntermediateProblems.SortingAndLimiting;

public class Student {

    int id;
    String firstName;
    int age;
    String gender;
    String city;
    public int rank;
    String contacts;

    public Student(int id, String firstName, int age, String gender,
                   String city, int rank, String contacts) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.rank = rank;
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return id + " | " + firstName + " | " + age + " | " +
               gender + " | " + city + " | " + rank;
    }
}


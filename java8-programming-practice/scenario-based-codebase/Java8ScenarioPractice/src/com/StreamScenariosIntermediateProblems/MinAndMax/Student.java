package com.StreamScenariosIntermediateProblems.MinAndMax;

public class Student {

    private int id;
    private String name;
    private String firstName;
    private int age;
    private String gender;
    private String city;
    private double rank;
    private String contacts;

    public Student(int id, String name, String firstName, int age,
                   String gender, String city, double rank, String contacts) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.rank = rank;
        this.contacts = contacts;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public double getRank() {
        return rank;
    }

    public String getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", rank=" + rank +
                ", contacts='" + contacts + '\'' +
                '}';
    }
}

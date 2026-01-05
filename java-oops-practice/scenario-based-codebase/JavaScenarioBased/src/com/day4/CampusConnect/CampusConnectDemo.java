package com.day4.CampusConnect;

public class CampusConnectDemo {
    public static void main(String[] args) {

        Faculty f1 = new Faculty(1, "Dr. Sharma", "sharma@college.edu");
        Course java = new Course("Java Programming", f1);

        int[] grades = {8, 9, 7};
        Student s1 = new Student(101, "Ayush", "ayush@college.edu", grades);

        s1.enrollCourse(java);

        s1.printDetails(); // polymorphism
        f1.printDetails();
    }
}

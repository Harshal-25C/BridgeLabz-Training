package com.day9.UniversityDigitalRecordSystem;

public class Student {
	int rollNo;
    String name;
    String department;
    Student left, right;

    public Student(int rollNo, String name, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.left = this.right = null;
    }
}

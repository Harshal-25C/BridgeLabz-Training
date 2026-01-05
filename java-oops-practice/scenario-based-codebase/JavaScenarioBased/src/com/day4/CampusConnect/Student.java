package com.day4.CampusConnect;

class Student extends Person implements ICourseActions {
    private int[] grades; // private data hiding
    private Course course;

    Student(int id, String name, String email, int[] grades) {
        super(id, name, email);
        this.grades = grades;
    }

    public double calculateGPA() {
        int sum = 0;
        for (int g : grades) sum += g;
        return (double) sum / grades.length; // operators used
    }

    @Override
    public void enrollCourse(Course course) {
        this.course = course;
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Course course) {
        this.course = null;
        course.removeStudent(this);
    }

    @Override
    void printDetails() {
        System.out.println("Student: " + name + ", GPA: " + calculateGPA());
    }
}
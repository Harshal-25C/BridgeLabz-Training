package com.objectmodeling;

public class SchoolAssociationAggregation {
    public static void main(String[] args) {

        // Create School
        School school = new School("Green Valley School");

        // Create Students
        Student s1 = new Student("Rahul");
        Student s2 = new Student("Anita");

        // Create Courses
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Science");

        // Add students to school (Aggregation)
        school.addStudent(s1);
        school.addStudent(s2);

        // Student enrolls in courses (Association)
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        // Display details
        school.showStudents();
        s1.showCourses();
        c1.showStudents();
    }
}

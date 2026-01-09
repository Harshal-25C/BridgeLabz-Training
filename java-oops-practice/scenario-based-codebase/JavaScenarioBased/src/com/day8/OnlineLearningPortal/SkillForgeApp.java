package com.day8.OnlineLearningPortal;

public class SkillForgeApp{
    public static void main(String[] args){

        Instructor instructor = new Instructor("Dr. Smith", "smith@skillforge.com");
        Student student = new Student("Harshal", "harshal@skillforge.com");

        String[] modules = {"Java Basics", "OOP", "Collections", "Projects"};
        Course course = new Course("Java Mastery", instructor, modules);

        //Student progress
        student.completeModule();
        student.completeModule();
        student.completeModule();
        student.completeModule();

        student.setGrade(85); //operator-based grading

        course.generateCertificate(student);

        instructor.printDetails();
        student.printDetails();
        System.out.println("Course Rating: " + course.getRating());
    }
}

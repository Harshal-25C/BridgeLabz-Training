package com.constructorandaccessmodifiers.levelone;

public class Course{

	//Instance variables
    String courseName;
    int duration; 
    double fee;

    //Class variable (common for all courses)
    static String instituteName = "ABC Institute";

    //Parameterized constructor
    Course(String courseName, int duration, double fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    //Instance method: displays course details
    void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("---------------------------");
    }

    //Class method: updates institute name for all courses
    static void updateInstituteName(String newName){
        instituteName = newName;
    }
    
    public static void main(String[] args){
        //Creating course objects
        Course c1 = new Course("Java Programming", 8, 499.99);
        Course c2 = new Course("Python Programming", 6, 399.99);

        //Displaying details
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        //Updating institute name using class method
        Course.updateInstituteName("XYZ Institute");

        //Displaying details again to see updated institute name
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

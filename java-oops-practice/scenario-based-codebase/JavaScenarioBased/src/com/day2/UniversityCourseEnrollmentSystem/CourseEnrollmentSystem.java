package com.day2.UniversityCourseEnrollmentSystem;

public class CourseEnrollmentSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course java = new Course(101, "Java Programming", 4);

        //Students (polymorphism)
        Student s1 = new UnderGraduate(1, "Harshh", "Java Programming");
        Student s2 = new PostGraduate(2, "Anvii", "Java Programming");

        //Enrollment
        Enrollment e1 = new Enrollment(s1, java);
        Enrollment e2 = new Enrollment(s2, java);

        e1.enroll();
        e2.enroll();

        System.out.println();

        //Faculty assigns grades
        Faculty f1 = new Faculty("Dr. Sharma", s1);
        Faculty f2 = new Faculty("Dr. Mehta", s2);

        f1.assignGrade(85);
        f2.assignGrade(92);

        System.out.println();

        //Display transcripts using polymorphism
        s1.displayInfo();
        s2.displayInfo();
	}

}

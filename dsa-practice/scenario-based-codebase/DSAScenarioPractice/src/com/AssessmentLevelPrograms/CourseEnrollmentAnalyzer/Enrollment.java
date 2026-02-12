package com.AssessmentLevelPrograms.CourseEnrollmentAnalyzer;

import java.time.LocalDate;

public class Enrollment {

    private String studentName;
    private String courseName;
    private String courseCategory;
    private LocalDate enrollmentDate;

    public Enrollment(String studentName, String courseName, String courseCategory, LocalDate enrollmentDate) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.courseCategory = courseCategory;
        this.enrollmentDate = enrollmentDate;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCategory() {
        return courseCategory;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    @Override
    public String toString() {
        return studentName + " - " + courseName + " - " + courseCategory + " - " + enrollmentDate;
    }
}

/* Question 3: Course Enrollment Analyzer 
Scenario
A training institute wants to analyze course enrollments before publishing its annual report. 

Each enrollment contains:
• Student Name
• Course Name
• Course Category
• Enrollment Date
Problem Statement  -
Develop a Java Application that:
• Implements a class.
• Stores enrollment data.
• Uses Streams API to:
• Filter enrollments by course category
• Count enrollments per category
• Group enrollments by course name
• Sort enrollments by enrollment date

Hints:
• Lambda expressions
• Method references (where applicable)
• Collectors ( , )
JUnit Requirement (Mandatory)
• Write JUnit test cases to validate:
• Filtering logic by course category
• Counting enrollments per category

*/
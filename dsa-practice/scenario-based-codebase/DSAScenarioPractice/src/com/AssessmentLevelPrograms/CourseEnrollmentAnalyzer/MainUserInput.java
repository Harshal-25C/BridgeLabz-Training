package com.AssessmentLevelPrograms.CourseEnrollmentAnalyzer;

import java.time.LocalDate;
import java.util.*;

public class MainUserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Enrollment> enrollments = new ArrayList<>();

        System.out.print("Enter number of enrollments: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        for(int i=0; i<n; i++) {

            System.out.println("\nEnter details for Enrollment " + (i + 1));

            System.out.print("Student Name: ");
            String studentName = sc.nextLine();

            System.out.print("Course Name: ");
            String courseName = sc.nextLine();

            System.out.print("Course Category: ");
            String category = sc.nextLine();

            System.out.print("Enrollment Date (yyyy-mm-dd): ");
            LocalDate date = LocalDate.parse(sc.nextLine());

            enrollments.add(new Enrollment(studentName, courseName, category, date));
        }

        // Filter by category (dynamic input)
        System.out.print("\nEnter category to filter: ");
        String filterCategory = sc.nextLine();

        System.out.println("\nFiltered Enrollments:");
        EnrollmentAnalyzer.filterByCategory(enrollments, filterCategory)
                .forEach(System.out::println);

        // Count per category
        System.out.println("\nCount Per Category:");
        System.out.println(
                EnrollmentAnalyzer.countEnrollmentsPerCategory(enrollments)
        );

        // Group by course name
        System.out.println("\nGrouped By Course:");
        System.out.println(
                EnrollmentAnalyzer.groupByCourseName(enrollments)
        );

        // Sort by date
        System.out.println("\nSorted By Enrollment Date:");
        EnrollmentAnalyzer.sortByEnrollmentDate(enrollments)
                .forEach(System.out::println);

        sc.close();
    }
}

package com.AssessmentLevelPrograms.CourseEnrollmentAnalyzer;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Enrollment> enrollments = Arrays.asList(
                new Enrollment("Harshal", "Java", "Programming", LocalDate.of(2026, 1, 10)),
                new Enrollment("Aman", "Python", "Programming", LocalDate.of(2026, 1, 15)),
                new Enrollment("Riya", "Digital Marketing", "Marketing", LocalDate.of(2026, 1, 12)),
                new Enrollment("Sneha", "Java", "Programming", LocalDate.of(2026, 1, 8))
        );

        System.out.println("Filtered (Programming):");
        EnrollmentAnalyzer.filterByCategory(enrollments, "Programming")
                .forEach(System.out::println);

        System.out.println("\nCount Per Category:");
        System.out.println(EnrollmentAnalyzer.countEnrollmentsPerCategory(enrollments));

        System.out.println("\nGrouped By Course:");
        System.out.println(EnrollmentAnalyzer.groupByCourseName(enrollments));

        System.out.println("\nSorted By Date:");
        EnrollmentAnalyzer.sortByEnrollmentDate(enrollments)
                .forEach(System.out::println);
    }
}

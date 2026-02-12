package com.AssessmentLevelPrograms.CourseEnrollmentAnalyzer;

import java.util.*;
import java.util.stream.Collectors;

public class EnrollmentAnalyzer {

    // Filter by course category
    public static List<Enrollment> filterByCategory(List<Enrollment> enrollments, String category) {
        return enrollments.stream()
                .filter(e -> e.getCourseCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    // Count enrollments per category
    public static Map<String, Long> countEnrollmentsPerCategory(List<Enrollment> enrollments) {
        return enrollments.stream()
                .collect(Collectors.groupingBy(
                        Enrollment::getCourseCategory,
                        Collectors.counting()
                ));
    }

    // Group enrollments by course name
    public static Map<String, List<Enrollment>> groupByCourseName(List<Enrollment> enrollments) {
        return enrollments.stream()
                .collect(Collectors.groupingBy(Enrollment::getCourseName));
    }

    // Sort enrollments by enrollment date
    public static List<Enrollment> sortByEnrollmentDate(List<Enrollment> enrollments) {
        return enrollments.stream()
                .sorted(Comparator.comparing(Enrollment::getEnrollmentDate))
                .collect(Collectors.toList());
    }
}

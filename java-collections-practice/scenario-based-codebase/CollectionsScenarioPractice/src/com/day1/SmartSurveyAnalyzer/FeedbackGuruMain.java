package com.day1.SmartSurveyAnalyzer;
import java.util.*;

public class FeedbackGuruMain {

    public static void main(String[] args) {

        FeedbackGuru<String> guru = new FeedbackGuru<>();

        Map<String, List<String>> result = guru.analyzeFeedback("feedbacks", "Service");

        result.forEach((k, v) -> {
            System.out.println("\n" + k + " Feedback:");
            v.forEach(System.out::println);
        });
    }
}

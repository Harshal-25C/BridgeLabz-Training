package com.day1.SmartResumeFilteringSystem;
import java.util.*;

import java.util.*;

public class ResumeAnalyzerMain {

    public static void main(String[] args) {

        System.out.println("=== Resume Analyzer Started ===");

        ResumeAnalyzer analyzer = new ResumeAnalyzer();

        try {
            Map<String, ResumeData> resumeMap = analyzer.processResumes("resumes");

            List<ResumeData> candidates = new ArrayList<>(resumeMap.values());

            candidates.sort((a, b) -> b.getKeywordCount() - a.getKeywordCount());

            System.out.println("\n--- Sorted Candidates ---");
            for(ResumeData data : candidates) {
                System.out.println(data);
            }

        }catch (Exception e) {
            System.out.println("Application error: " + e.getMessage());
        }

        System.out.println("=== Resume Analyzer Finished ===");
    }
}

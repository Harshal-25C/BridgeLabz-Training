package com.day1.DigitalAnswerSheetValidator;

import java.util.*;

public class ExamScannerMain {

    public static void main(String[] args) {
    	
        try{
            List<String> answerKey = List.of("A", "B", "C", "D", "A", "B", "C");

            ExamScanner<MathAnswerSheet> scanner =new ExamScanner<>();

            Map<String, Integer> scores =
                    scanner.scanAnswers("src/com/day1/DigitalAnswerSheetValidator/exam/answers.csv", answerKey,MathAnswerSheet.class);

            PriorityQueue<StudentResult> ranking =
                    new PriorityQueue<>();

            for(Map.Entry<String, Integer> entry : scores.entrySet()) {
                ranking.add(
                        new StudentResult(entry.getKey(), entry.getValue())
                );
            }

            System.out.println("\n--- Exam Results (Ranked) ---");
            while(!ranking.isEmpty()) {
                System.out.println(ranking.poll());
            }

        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

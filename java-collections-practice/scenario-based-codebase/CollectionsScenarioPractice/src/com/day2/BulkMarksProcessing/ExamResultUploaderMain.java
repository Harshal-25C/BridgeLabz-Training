package com.day2.BulkMarksProcessing;

import java.util.*;

public class ExamResultUploaderMain {

    public static void main(String[] args) {

        try{
            ExamResultUploader<String> uploader = new ExamResultUploader<>();

            Map<String, List<Integer>> results = uploader.processResults("src/com/day2/BulkMarksProcessing/results/marks.csv");

            uploader.printTopScorers(results);

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

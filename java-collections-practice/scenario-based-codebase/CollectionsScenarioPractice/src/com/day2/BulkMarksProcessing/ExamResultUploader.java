package com.day2.BulkMarksProcessing;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamResultUploader<T> {

    private static final Pattern VALID_LINE = Pattern.compile("\\d+,\\w+,\\w+,\\d{1,3}");

    public Map<String, List<Integer>> processResults(String filePath)
            throws Exception {

        Map<String, List<Integer>> subjectMarks = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        while((line = br.readLine()) != null) {
            try{
                if(!VALID_LINE.matcher(line).matches()) {
                    throw new InvalidResultFormatException("Invalid line: " + line);
                }

                String[] parts = line.split(",");
                String subject = parts[2];
                int marks = Integer.parseInt(parts[3]);

                subjectMarks.computeIfAbsent(subject, k -> new ArrayList<>()).add(marks);

            }catch (InvalidResultFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        br.close();
        return subjectMarks;
    }

    public void printTopScorers(Map<String, List<Integer>> data) {

        for(Map.Entry<String, List<Integer>> entry : data.entrySet()) {

            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            pq.addAll(entry.getValue());

            System.out.println("Top scorer in " + entry.getKey() + " → " + pq.peek());
        }
    }
}

package com.day1.DigitalAnswerSheetValidator;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamScanner<T extends AnswerSheet> {

    private static final Pattern VALID_LINE_PATTERN = Pattern.compile("^[A-Za-z ]+(,[A-D])+$");

    public Map<String, Integer> scanAnswers(String filePath, List<String> answerKey,Class<T> sheetType) 
    		throws Exception {

        Map<String, Integer> scoreMap = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        while((line = br.readLine()) != null) {
            try{
                validateLine(line);

                String[] parts = line.split(",");
                String studentName = parts[0];

                List<String> answers = Arrays.asList(parts).subList(1, parts.length);

                T sheet = sheetType.getConstructor(List.class).newInstance(answers);

                int score = calculateScore(sheet, answerKey);
                scoreMap.put(studentName, score);

            }catch (Exception e) {
                System.out.println("Invalid entry skipped: " + line);
            }
        }
        br.close();
        return scoreMap;
    }

    private void validateLine(String line) throws Exception {
        if(!VALID_LINE_PATTERN.matcher(line).matches()) {
            throw new Exception("Formatting error");
        }
    }

    private int calculateScore(T sheet, List<String> key) {
        int score = 0;
        List<String> answers = sheet.getAnswers();

        for(int i=0; i<Math.min(answers.size(), key.size()); i++) {
            if(answers.get(i).equals(key.get(i))) {
                score++;
            }
        }
        return score;
    }
}

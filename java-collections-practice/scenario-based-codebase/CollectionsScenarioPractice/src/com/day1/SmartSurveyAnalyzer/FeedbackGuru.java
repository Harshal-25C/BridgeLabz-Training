package com.day1.SmartSurveyAnalyzer;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackGuru<T> {

    private static final Pattern RATING_PATTERN = Pattern.compile("(\\d{1,2})/10");

    public Map<String, List<String>> analyzeFeedback(String folderPath, T type) {

        Map<String, List<String>> categorized = new HashMap<>();
        categorized.put("Positive", new ArrayList<>());
        categorized.put("Neutral", new ArrayList<>());
        categorized.put("Negative", new ArrayList<>());

        File folder = new File(folderPath);
        File[] files = folder.listFiles((f) -> f.getName().endsWith(".txt"));

        if(files == null) return categorized;

        for(File file : files) {
            try(BufferedReader br = new BufferedReader(new FileReader(file))) {

                String line;
                while((line = br.readLine()) != null) {
                    try{
                        int rating = extractRating(line);

                        if(rating >= 8)
                            categorized.get("Positive").add(line);
                        else if(rating >= 5)
                            categorized.get("Neutral").add(line);
                        else
                            categorized.get("Negative").add(line);

                    } catch (Exception e) {
                        // Skip invalid feedback line
                    }
                }

            }catch (IOException e) {
                System.out.println("Error reading file: " + file.getName());
            }
        }
        return categorized;
    }

    private int extractRating(String text) throws Exception {
        Matcher matcher = RATING_PATTERN.matcher(text);
        if(matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        throw new Exception("Rating not found");
    }
}

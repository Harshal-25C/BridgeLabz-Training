package com.day1.SmartResumeFilteringSystem;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ResumeAnalyzer {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

    private static final Pattern PHONE_PATTERN =
            Pattern.compile("\\b[6-9][0-9]{9}\\b");

    private static final Pattern KEYWORD_PATTERN =
            Pattern.compile("\\b(Java|Python|Spring)\\b", Pattern.CASE_INSENSITIVE);

    public Map<String, ResumeData> processResumes(String folderPath) throws Exception {

        Map<String, ResumeData> resumeMap = new HashMap<>();

        File folder = new File(folderPath);
        if(!folder.exists() || !folder.isDirectory()) {
            throw new Exception("Invalid folder path: " + folderPath);
        }

        File[] files = folder.listFiles();
        if(files == null) return resumeMap;

        for(File file : files) {
            try{
                if(!file.getName().endsWith(".txt")) {
                    throw new InvalidResumeFormatException("Unsupported format: " + file.getName());
                }

                String content = readFile(file);

                String email = extractValue(content, EMAIL_PATTERN);
                if(email == null) {
                    throw new Exception("Email not found");
                }

                String phone = extractValue(content, PHONE_PATTERN);
                if(phone == null) phone = "Not Available";

                int keywordCount = countKeywords(content);

                ResumeData data = new ResumeData(email, phone, keywordCount);
                resumeMap.put(email, data);

            }catch (Exception e) {
                System.out.println("Skipping " + file.getName() + " → " + e.getMessage());
            }
        }

        return resumeMap;
    }

    private String readFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line;

        while((line = br.readLine()) != null) {
            sb.append(line).append(" ");
        }
        br.close();
        return sb.toString();
    }

    private String extractValue(String text, Pattern pattern) {
        Matcher matcher = pattern.matcher(text);
        return matcher.find() ? matcher.group() : null;
    }

    private int countKeywords(String text) {
        Matcher matcher = KEYWORD_PATTERN.matcher(text);
        int count = 0;
        while (matcher.find()) count++;
        return count;
    }
}

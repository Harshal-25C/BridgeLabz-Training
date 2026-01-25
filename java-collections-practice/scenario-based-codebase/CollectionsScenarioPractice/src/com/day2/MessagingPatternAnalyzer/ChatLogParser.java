package com.day2.MessagingPatternAnalyzer;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChatLogParser {

    private static final Pattern CHAT_PATTERN = Pattern.compile("\\[(.*?)\\] (.*?): (.*)");

    public Map<String, List<String>> parseChats(String filePath,
            MessageFilter<String> filter) throws Exception {

        Map<String, List<String>> chatMap = new TreeMap<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        while((line = br.readLine()) != null) {
            Matcher matcher = CHAT_PATTERN.matcher(line);

            if(matcher.matches()) {
                String user = matcher.group(2);
                String message = matcher.group(3);

                if(filter.allow(message)) {
                    chatMap.computeIfAbsent(user, k -> new ArrayList<>()).add(message);
                }
            }
        }
        br.close();
        return chatMap;
    }
}

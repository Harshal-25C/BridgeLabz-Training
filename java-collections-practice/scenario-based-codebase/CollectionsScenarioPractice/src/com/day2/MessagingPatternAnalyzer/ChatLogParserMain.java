package com.day2.MessagingPatternAnalyzer;
import java.util.*;

public class ChatLogParserMain {

    public static void main(String[] args) {

        try{
            ChatLogParser parser = new ChatLogParser();

            MessageFilter<String> idleFilter = msg -> !(msg.toLowerCase().contains("lol")
                    || msg.toLowerCase().contains("brb")
                    || msg.toLowerCase().contains("ok"));

            Map<String, List<String>> chats = parser.parseChats("src/com/day2/MessagingPatternAnalyzer/logs/chat.txt", idleFilter);

            chats.forEach((user, messages) -> {
                System.out.println("\nUser: " + user);
                messages.forEach(System.out::println);
            });

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

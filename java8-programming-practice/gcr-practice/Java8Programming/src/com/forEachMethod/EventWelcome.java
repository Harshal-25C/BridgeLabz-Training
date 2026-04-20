package com.forEachMethod;

import java.util.*;

public class EventWelcome {

    public static void main(String[] args) {

        List<String> attendees =
                Arrays.asList("Harshal", "Amit", "Neha", "Zoya");

        attendees.forEach(name ->
                System.out.println("Welcome to the event, " + name + "!")
        );
    }
}

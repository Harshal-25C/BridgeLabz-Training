package com.jsonData.AdvancedProblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class ListToJson {
    public static void main(String[] args) throws Exception {

        List<User> users = Arrays.asList(
                new User("Amit", 22),
                new User("Neha", 28),
                new User("Rahul", 30)
        );

        ObjectMapper mapper = new ObjectMapper();
        String jsonArray = mapper.writerWithDefaultPrettyPrinter()
                                 .writeValueAsString(users);

        System.out.println(jsonArray);
    }
}

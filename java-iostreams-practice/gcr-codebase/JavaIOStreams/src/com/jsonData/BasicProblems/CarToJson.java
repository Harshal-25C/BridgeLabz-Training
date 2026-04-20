package com.jsonData.BasicProblems;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CarToJson {
    public static void main(String[] args) throws Exception {

        Car car = new Car("Tesla", "Model 3", 2024);
        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(car);

        System.out.println(json);
    }
}

package com.ConversionLogicalQuestions.MapToList;

import java.util.*;
import java.util.stream.Collectors;

public class MapToDTOList {

    static class DataDTO {
        private String key;
        private int value;

        DataDTO(String key, int value) {
            this.key = key;
            this.value = value;
        }

        public String toString() {
            return "DataDTO{key='" + key + "', value=" + value + "}";
        }
    }

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("P", 100);
        map.put("Q", 200);

        List<DataDTO> dtoList =
                map.entrySet()
                   .stream()
                   .map(e -> new DataDTO(e.getKey(), e.getValue()))
                   .collect(Collectors.toList());

        System.out.println(dtoList);
    }
}

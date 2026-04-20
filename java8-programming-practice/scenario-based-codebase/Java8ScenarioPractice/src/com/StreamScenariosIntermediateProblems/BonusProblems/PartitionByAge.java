package com.StreamScenariosIntermediateProblems.BonusProblems;

import java.util.*;
import java.util.stream.Collectors;

public class PartitionByAge {

    public static void main(String[] args) {

        Map<Boolean, List<Student>> map =
                StudentData.getStudents().stream()
                        .collect(Collectors.partitioningBy(s -> s.getAge() > 25));

        System.out.println("Age > 25  : " + map.get(true));
        System.out.println("Age <= 25 : " + map.get(false));
    }
}

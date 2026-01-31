package com.StreamScenariosIntermediateProblems.BonusProblems;

import java.util.*;
import java.util.stream.Collectors;

public class PartitionByRank {

    public static void main(String[] args) {

        Map<Boolean, List<Student>> map =
                StudentData.getStudents().stream()
                        .collect(Collectors.partitioningBy(s -> s.getRank() < 100));

        System.out.println("Rank < 100  : " + map.get(true));
        System.out.println("Rank >= 100 : " + map.get(false));
    }
}

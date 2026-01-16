package com.collections.SetInterface;
import java.util.*;

public class SetEquality {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 2, 1));

        boolean isEqual = set1.equals(set2);
        System.out.println(isEqual);
    }
}

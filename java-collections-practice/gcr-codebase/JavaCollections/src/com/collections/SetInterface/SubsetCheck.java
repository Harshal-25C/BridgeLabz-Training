package com.collections.SetInterface;
import java.util.*;

public class SubsetCheck {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Set.of(2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(1, 2, 3, 4));

        boolean isSubset = set2.containsAll(set1);
        System.out.println(isSubset);
    }
}

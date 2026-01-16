package com.collections.SetInterface;
import java.util.*;

public class SetToSortedList {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Set.of(5, 3, 9, 1));

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        System.out.println(list);
    }
}

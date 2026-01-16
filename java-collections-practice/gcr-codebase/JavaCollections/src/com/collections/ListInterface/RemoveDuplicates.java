package com.collections.ListInterface;
import java.util.*;

public class RemoveDuplicates {

    public static <T> List<T> removeDuplicates(List<T> list) {

        Set<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {

        List<Integer> list = List.of(3, 1, 2, 2, 3, 4);
        System.out.println(removeDuplicates(list));
    }
}

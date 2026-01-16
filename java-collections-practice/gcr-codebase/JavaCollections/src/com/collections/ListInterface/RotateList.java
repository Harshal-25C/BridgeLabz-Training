package com.collections.ListInterface;
import java.util.*;

public class RotateList {

    public static <T> List<T> rotate(List<T> list, int k) {

        int n = list.size();
        k %= n;

        List<T> result = new ArrayList<>();

        for(int i=k; i<n; i++)
            result.add(list.get(i));

        for(int i=0; i<k; i++)
            result.add(list.get(i));

        return result;
    }

    public static void main(String[] args) {

        List<Integer> list = List.of(10, 20, 30, 40, 50);
        System.out.println(rotate(list, 2));
    }
}

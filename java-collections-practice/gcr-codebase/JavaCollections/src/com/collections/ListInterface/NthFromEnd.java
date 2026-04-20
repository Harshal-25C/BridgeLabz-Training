package com.collections.ListInterface;
import java.util.*;

public class NthFromEnd {

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {

        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();

        for(int i=0; i<n; i++) {
            if(!fast.hasNext()) throw new IllegalArgumentException("N is larger than list size");
            fast.next();
        }

        while(fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(List.of("A", "B", "C", "D", "E"));

        System.out.println(findNthFromEnd(list, 2));
    }
}

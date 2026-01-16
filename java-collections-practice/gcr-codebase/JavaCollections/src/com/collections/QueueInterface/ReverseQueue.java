package com.collections.QueueInterface;
import java.util.*;

public class ReverseQueue {

    public static void reverseQueue(Queue<Integer> queue) {
        if(queue.isEmpty()) {
            return;
        }

        int front = queue.remove();
        reverseQueue(queue);
        queue.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(List.of(10, 20, 30));
        reverseQueue(q);
        System.out.println(q);
    }
}

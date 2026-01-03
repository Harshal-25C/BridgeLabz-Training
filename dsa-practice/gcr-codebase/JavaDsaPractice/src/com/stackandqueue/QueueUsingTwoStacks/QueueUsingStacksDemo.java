package com.stackandqueue.QueueUsingTwoStacks;

public class QueueUsingStacksDemo{
 public static void main(String[] args){
     QueueUsingStacks queue = new QueueUsingStacks();

     queue.enqueue(10);
     queue.enqueue(20);
     queue.enqueue(30);

     queue.display();

     System.out.println("Dequeued: " + queue.dequeue());
     System.out.println("Dequeued: " + queue.dequeue());

     queue.display();

     queue.enqueue(40);
     queue.display();
 }
}

package com.stackandqueue.QueueUsingTwoStacks;
import java.util.Stack;

class QueueUsingStacks{
 //Stack used for enqueue operation
 private Stack<Integer> stackEnqueue = new Stack<>();

 //Stack used for dequeue operation
 private Stack<Integer> stackDequeue = new Stack<>();

 //Enqueue operation
 public void enqueue(int data){
     // Simply push element into enqueue stack
     stackEnqueue.push(data);
     System.out.println("Enqueued: " + data);
 }

 //Dequeue operation
 public int dequeue(){

     //If both stacks are empty, queue is empty
     if(stackEnqueue.isEmpty() && stackDequeue.isEmpty()){
         System.out.println("Queue is empty");
         return -1;
     }

     //Transfer elements only if dequeue stack is empty
     if(stackDequeue.isEmpty()){
         while (!stackEnqueue.isEmpty()) {
             stackDequeue.push(stackEnqueue.pop());
         }
     }

     //Pop element from dequeue stack
     return stackDequeue.pop();
 }

 public void display() {
     if (stackEnqueue.isEmpty() && stackDequeue.isEmpty()) {
         System.out.println("Queue is empty");
         return;
     }

     System.out.print("Queue elements: ");

     // Display elements from dequeue stack
     for (int i = stackDequeue.size() - 1; i >= 0; i--) {
         System.out.print(stackDequeue.get(i) + " ");
     }

     // Display elements from enqueue stack
     for (int i = 0; i < stackEnqueue.size(); i++) {
         System.out.print(stackEnqueue.get(i) + " ");
     }

     System.out.println();
 }
}

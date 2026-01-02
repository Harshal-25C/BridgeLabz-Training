package com.linkedlist.CircularLinkedList.TaskSchedular;

public class CircularTaskScheduler{
 public static void main(String[] args){
     TaskScheduler scheduler = new TaskScheduler();

     scheduler.addAtEnd(1, "Design Module", 2, "10-10-2025");
     scheduler.addAtEnd(2, "Code Implementation", 1, "15-10-2025");
     scheduler.addAtBeginning(3, "Requirement Analysis", 3, "05-10-2025");
     scheduler.addAtPosition(2, 4, "Testing", 2, "18-10-2025");

     System.out.println("\nAll Tasks:");
     scheduler.displayTasks();

     System.out.println("\nView Next Task:");
     scheduler.viewNextTask();
     scheduler.viewNextTask();

     System.out.println("\nSearch Tasks with Priority 2:");
     scheduler.searchByPriority(2);

     System.out.println("\nRemove Task with ID 2:");
     scheduler.removeTask(2);

     System.out.println("\nTasks After Removal:");
     scheduler.displayTasks();
 }
}

package com.linkedlist.CircularLinkedList.TaskSchedular;

//Node class representing a Task
class Task{
 int taskId;
 String taskName;
 int priority;
 String dueDate;
 Task next;

 Task(int taskId, String taskName, int priority, String dueDate){
     this.taskId = taskId;
     this.taskName = taskName;
     this.priority = priority;
     this.dueDate = dueDate;
     this.next = null;
 }
}

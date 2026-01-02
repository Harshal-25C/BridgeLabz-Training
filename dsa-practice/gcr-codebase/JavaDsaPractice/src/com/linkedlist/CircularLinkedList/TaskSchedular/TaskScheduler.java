package com.linkedlist.CircularLinkedList.TaskSchedular;

//Circular Linked List Task Scheduler
class TaskScheduler {

 private Task head = null;
 private Task tail = null;
 private Task current = null;

 //Add task at beginning
 public void addAtBeginning(int id, String name, int priority, String dueDate){
     Task newTask = new Task(id, name, priority, dueDate);

     if(head == null){
         head = tail = newTask;
         newTask.next = head;
     }else{
         newTask.next = head;
         tail.next = newTask;
         head = newTask;
     }
 }

 // Add task at end
 public void addAtEnd(int id, String name, int priority, String dueDate) {
     Task newTask = new Task(id, name, priority, dueDate);

     if (head == null) {
         head = tail = newTask;
         newTask.next = head;
     } else {
         tail.next = newTask;
         newTask.next = head;
         tail = newTask;
     }
 }

 // Add task at specific position (1-based index)
 public void addAtPosition(int position, int id, String name, int priority, String dueDate) {
     if (position <= 1 || head == null) {
         addAtBeginning(id, name, priority, dueDate);
         return;
     }

     Task newTask = new Task(id, name, priority, dueDate);
     Task temp = head;
     int count = 1;

     while (count < position - 1 && temp.next != head) {
         temp = temp.next;
         count++;
     }

     newTask.next = temp.next;
     temp.next = newTask;

     if (temp == tail) {
         tail = newTask;
     }
 }

 // Remove task by Task ID
 public void removeTask(int taskId) {
     if (head == null) {
         System.out.println("Task list is empty");
         return;
     }

     Task temp = head;
     Task prev = tail;

     do {
         if (temp.taskId == taskId) {

             // Single node case
             if (head == tail) {
                 head = tail = current = null;
                 return;
             }

             // Removing head
             if (temp == head) {
                 head = head.next;
                 tail.next = head;
             } else {
                 prev.next = temp.next;
                 if (temp == tail) {
                     tail = prev;
                 }
             }
             System.out.println("Task removed successfully");
             return;
         }
         prev = temp;
         temp = temp.next;
     } while (temp != head);

     System.out.println("Task not found");
 }

 // View current task and move to next
 public void viewNextTask() {
     if (head == null) {
         System.out.println("No tasks available");
         return;
     }

     if (current == null) {
         current = head;
     }

     displayTask(current);
     current = current.next;
 }

 //Display all tasks
 public void displayTasks(){
     if (head == null) {
         System.out.println("No tasks to display");
         return;
     }

     Task temp = head;
     do {
         displayTask(temp);
         temp = temp.next;
     } while (temp != head);
 }

 //Search task by Priority
 public void searchByPriority(int priority) {
     if (head == null) {
         System.out.println("No tasks available");
         return;
     }

     Task temp = head;
     boolean found = false;

     do{
         if(temp.priority == priority){
             displayTask(temp);
             found = true;
         }
         temp = temp.next;
     }while (temp != head);

     if(!found){
         System.out.println("No task found with priority " + priority);
     }
 }

 //Helper method to display a task
 private void displayTask(Task t){
     System.out.println(
         "Task ID: " + t.taskId +
         ", Name: " + t.taskName +
         ", Priority: " + t.priority +
         ", Due Date: " + t.dueDate
     );
 }
}

package com.linkedlist.CircularLinkedList.RoundRobinScheduling;

//Circular Linked List for Round Robin Scheduling
class RoundRobinScheduler{

 private Process head = null;
 private Process tail = null;
 private int timeQuantum;

 RoundRobinScheduler(int timeQuantum){
     this.timeQuantum = timeQuantum;
 }

 //Add process at end
 public void addProcess(int pid, int burstTime, int priority){
     Process newProcess = new Process(pid, burstTime, priority);

     if(head == null){
         head = tail=newProcess;
         newProcess.next = head;
     }else{
         tail.next = newProcess;
         newProcess.next = head;
         tail = newProcess;
     }
 }

 //Display processes in circular list
 public void displayProcesses(){
     if(head==null){
         System.out.println("No processes in queue");
         return;
     }

     Process temp = head;
     do{
         System.out.println("PID: " + temp.pid +
                 " | Remaining Time: " + temp.remainingTime);
         temp = temp.next;
     } while (temp != head);
 }

 //Remove completed process
 private void removeProcess(Process prev, Process current) {
     if(current==head && current==tail){
         head = tail = null;
     }else{
         prev.next = current.next;
         if(current == head){
             head = current.next;
             tail.next = head;
         }
         if(current == tail){
             tail = prev;
         }
     }
 }

 //Round Robin Scheduling Simulation
 public void schedule(){
     if(head == null){
         System.out.println("No processes to schedule");
         return;
     }

     int currentTime = 0;
     int totalWaitingTime = 0;
     int totalTurnaroundTime = 0;
     int processCount = countProcesses();

     Process current = head;
     Process prev = tail;

     System.out.println("\n--- Round Robin Scheduling Start ---");

     while (head != null) {

         if (current.remainingTime > 0) {

             int executionTime = Math.min(timeQuantum, current.remainingTime);
             current.remainingTime -= executionTime;
             currentTime += executionTime;

             // Update waiting time for other processes
             Process temp = head;
             do {
                 if (temp != current && temp.remainingTime > 0) {
                     temp.waitingTime += executionTime;
                 }
                 temp = temp.next;
             } while (temp != head);

             // If process completes
             if (current.remainingTime == 0) {
                 current.turnaroundTime = currentTime;
                 totalWaitingTime += current.waitingTime;
                 totalTurnaroundTime += current.turnaroundTime;

                 removeProcess(prev, current);
                 current = prev.next;
             } else {
                 prev = current;
                 current = current.next;
             }

             System.out.println("\nQueue after this round:");
             displayProcesses();
         }
     }

     System.out.println("\n--- Scheduling Completed ---");
     System.out.println("Average Waiting Time: " +
             (double) totalWaitingTime / processCount);
     System.out.println("Average Turnaround Time: " +
             (double) totalTurnaroundTime / processCount);
 }

 //Count number of processes
 private int countProcesses() {
     if (head == null) return 0;
     int count = 0;
     Process temp = head;
     do {
         count++;
         temp = temp.next;
     } while (temp != head);
     return count;
 }
}


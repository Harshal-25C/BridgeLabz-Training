package com.linkedlist.CircularLinkedList.RoundRobinScheduling;

//Node class representing a Process
class Process{
 int pid;
 int burstTime;
 int remainingTime;
 int priority;
 int waitingTime;
 int turnaroundTime;
 Process next;

 Process(int pid, int burstTime, int priority){
     this.pid = pid;
     this.burstTime = burstTime;
     this.remainingTime = burstTime;
     this.priority = priority;
     this.next = null;
 }
}

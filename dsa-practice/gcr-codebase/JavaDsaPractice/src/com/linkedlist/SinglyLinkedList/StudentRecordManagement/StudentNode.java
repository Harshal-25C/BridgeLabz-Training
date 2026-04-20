package com.linkedlist.SinglyLinkedList.StudentRecordManagement;

//Node class representing a single student record
class StudentNode{
	int rollNo;
    String name;
    int age;
    char grade;
    StudentNode next;

 //Constructor to initialize student details
 StudentNode(int rollNo, String name, int age, char grade){
     this.rollNo = rollNo;
     this.name = name;
     this.age = age;
     this.grade = grade;
     this.next = null;
 }
}

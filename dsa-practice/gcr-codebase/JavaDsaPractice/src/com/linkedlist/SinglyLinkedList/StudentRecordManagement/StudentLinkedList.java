package com.linkedlist.SinglyLinkedList.StudentRecordManagement;

class StudentLinkedList {
 private StudentNode head;
 
 //Add student at the beginning
 public void addAtBeginning(int rollNo, String name, int age, char grade){
     StudentNode newNode = new StudentNode(rollNo, name, age, grade);
     newNode.next = head;
     head = newNode;
 }

 //Add student at the end
 public void addAtEnd(int rollNo, String name, int age, char grade){
     StudentNode newNode = new StudentNode(rollNo, name, age, grade);

     if(head == null){
         head = newNode;
         return;
     }

     StudentNode temp = head;
     while(temp.next != null){
         temp = temp.next;
     }
     temp.next = newNode;
 }

 //Add student at a specific position (1-based index)
 public void addAtPosition(int position, int rollNo, String name, int age, char grade) {
     if (position <= 0) {
         System.out.println("Invalid position");
         return;
     }

     if (position == 1) {
         addAtBeginning(rollNo, name, age, grade);
         return;
     }

     StudentNode newNode = new StudentNode(rollNo, name, age, grade);
     StudentNode temp = head;

     for (int i = 1; i < position - 1 && temp != null; i++) {
         temp = temp.next;
     }

     if (temp == null) {
         System.out.println("Position out of range");
         return;
     }

     newNode.next = temp.next;
     temp.next = newNode;
 }

 // Delete student by Roll Number
 public void deleteByRollNo(int rollNo) {
     if (head == null) {
         System.out.println("List is empty");
         return;
     }

     if (head.rollNo == rollNo) {
         head = head.next;
         System.out.println("Student deleted successfully");
         return;
     }

     StudentNode temp = head;
     while (temp.next != null && temp.next.rollNo != rollNo) {
         temp = temp.next;
     }

     if (temp.next == null) {
         System.out.println("Student not found");
     } else {
         temp.next = temp.next.next;
         System.out.println("Student deleted successfully");
     }
 }

 // Search student by Roll Number
 public void searchStudent(int rollNo) {
     StudentNode temp = head;

     while (temp != null) {
         if (temp.rollNo == rollNo) {
             System.out.println("Student Found:");
             System.out.println(temp.rollNo + " " + temp.name + " " + temp.age + " " + temp.grade);
             return;
         }
         temp = temp.next;
     }
     System.out.println("Student not found");
 }

 // Update student grade by Roll Number
 public void updateGrade(int rollNo, char newGrade) {
     StudentNode temp = head;

     while (temp != null) {
         if (temp.rollNo == rollNo) {
             temp.grade = newGrade;
             System.out.println("Grade updated successfully");
             return;
         }
         temp = temp.next;
     }
     System.out.println("Student not found");
 }

 // Display all student records
 public void displayStudents() {
     if (head == null) {
         System.out.println("No student records available");
         return;
     }

     StudentNode temp = head;
     System.out.println("RollNo  Name  Age  Grade");

     while (temp != null) {
         System.out.println(temp.rollNo + "   " + temp.name + "   " + temp.age + "   " + temp.grade);
         temp = temp.next;
     }
 }
}

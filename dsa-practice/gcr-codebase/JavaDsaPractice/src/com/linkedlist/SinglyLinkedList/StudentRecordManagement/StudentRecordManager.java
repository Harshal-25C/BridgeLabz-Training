package com.linkedlist.SinglyLinkedList.StudentRecordManagement;

public class StudentRecordManager{
 public static void main(String[] args) {
     StudentLinkedList list = new StudentLinkedList();

     //Adding student records
     list.addAtBeginning(101, "Amit", 20, 'A');
     list.addAtEnd(102, "Neha", 21, 'B');
     list.addAtPosition(2, 103, "Ravi", 19, 'A');

     //Display all students
     list.displayStudents();

     // Search a student
     list.searchStudent(102);

     //Update grade
     list.updateGrade(102, 'A');

     // Delete a student
     list.deleteByRollNo(101);

     // Display updated list
     list.displayStudents();
 }
}

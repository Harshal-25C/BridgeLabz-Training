package com.linkedlist.DoublyLinkedList.UndoRedoFunctionalityForTextEditor;

//Doubly Linked List for Undo/Redo functionality
class UndoRedoManager{

 private TextState head;
 private TextState tail;
 private TextState current;
 private int size;
 private final int MAX_HISTORY = 10;

 //Add a new text state (typing or action)
 public void addState(String newText) {
     TextState newNode = new TextState(newText);

     //If undo was used, remove all redo states
     if(current!=null && current.next!=null){
         current.next.prev = null;
         current.next = null;
         tail = current;
         size = calculateSize();
     }

     if(head == null){
         head = tail = current = newNode;
         size = 1;
     }else{
         tail.next = newNode;
         newNode.prev = tail;
         tail = newNode;
         current = newNode;
         size++;
     }

     //Maintain fixed history size
     if(size>MAX_HISTORY){
         head = head.next;
         head.prev = null;
         size--;
     }
 }

 //Undo operation
 public void undo(){
     if (current != null && current.prev != null){
         current = current.prev;
     } else {
         System.out.println("Undo not possible");
     }
 }

 //Redo operation
 public void redo(){
     if (current != null && current.next != null){
         current = current.next;
     }else{
         System.out.println("Redo not possible");
     }
 }

 //Display current text state
 public void displayCurrentState(){
     if(current != null){
         System.out.println("Current Text: " + current.content);
     }else{
         System.out.println("No text available");
     }
 }

 //Helper method to recalculate size after clearing redo history
 private int calculateSize(){
     int count = 0;
     TextState temp = head;
     while(temp != null){
         count++;
         temp = temp.next;
     }
     return count;
 }
}


package com.linkedlist.SinglyLinkedList.InventoryManagementSystem;

//Node class representing an inventory item
class ItemNode{
 int itemId;
 String itemName;
 int quantity;
 double price;
 ItemNode next; 

 //Constructor to initialize item details
 ItemNode(int itemId, String itemName, int quantity, double price) {
     this.itemId = itemId;
     this.itemName = itemName;
     this.quantity = quantity;
     this.price = price;
     this.next = null;
 }
}

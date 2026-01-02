package com.linkedlist.SinglyLinkedList.InventoryManagementSystem;

public class InventoryManagement{
 public static void main(String[] args){

     InventoryList inventory = new InventoryList();

     inventory.addAtEnd(101, "Laptop", 5, 55000);
     inventory.addAtBeginning(102, "Mouse", 20, 500);
     inventory.addAtPosition(2, 103, "Keyboard", 10, 1500);

     inventory.displayInventory();

     inventory.searchById(101);
     inventory.updateQuantity(102, 30);

     inventory.calculateTotalValue();

     inventory.sortByName(true);   // Ascending
     inventory.displayInventory();

     inventory.sortByPrice(false); // Descending
     inventory.displayInventory();

     inventory.removeByItemId(103);
     inventory.displayInventory();
 }
}

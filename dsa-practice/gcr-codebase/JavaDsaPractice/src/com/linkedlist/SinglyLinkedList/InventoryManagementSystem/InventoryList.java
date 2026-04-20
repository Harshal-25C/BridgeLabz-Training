package com.linkedlist.SinglyLinkedList.InventoryManagementSystem;

//Singly Linked List for Inventory Management
class InventoryList{
 private ItemNode head;

 //Add item at the beginning
 public void addAtBeginning(int id, String name, int qty, double price) {
     ItemNode newNode = new ItemNode(id, name, qty, price);
     newNode.next = head;
     head = newNode;
 }

 //Add item at the end
 public void addAtEnd(int id, String name, int qty, double price) {
     ItemNode newNode = new ItemNode(id, name, qty, price);

     if(head == null){
         head = newNode;
         return;
     }

     ItemNode temp = head;
     while (temp.next != null){
         temp = temp.next;
     }
     temp.next = newNode;
 }

 //Add item at a specific position (1-based index)
 public void addAtPosition(int position, int id, String name, int qty, double price) {
     if (position <= 0) {
         System.out.println("Invalid position");
         return;
     }

     if (position == 1) {
         addAtBeginning(id, name, qty, price);
         return;
     }

     ItemNode newNode = new ItemNode(id, name, qty, price);
     ItemNode temp = head;

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

 //Remove item based on Item ID
 public void removeByItemId(int itemId) {
     if (head == null) {
         System.out.println("Inventory is empty");
         return;
     }

     if (head.itemId == itemId) {
         head = head.next;
         System.out.println("Item removed successfully");
         return;
     }

     ItemNode temp = head;
     while (temp.next != null && temp.next.itemId != itemId) {
         temp = temp.next;
     }

     if (temp.next == null) {
         System.out.println("Item not found");
     } else {
         temp.next = temp.next.next;
         System.out.println("Item removed successfully");
     }
 }

 //Update quantity by Item ID
 public void updateQuantity(int itemId, int newQty) {
     ItemNode temp = head;

     while (temp != null) {
         if (temp.itemId == itemId) {
             temp.quantity = newQty;
             System.out.println("Quantity updated successfully");
             return;
         }
         temp = temp.next;
     }
     System.out.println("Item not found");
 }

 // Search item by Item ID
 public void searchById(int itemId) {
     ItemNode temp = head;

     while (temp != null) {
         if (temp.itemId == itemId) {
             displayItem(temp);
             return;
         }
         temp = temp.next;
     }
     System.out.println("Item not found");
 }

 // Search item by Item Name
 public void searchByName(String name) {
     ItemNode temp = head;
     boolean found = false;

     while (temp != null) {
         if (temp.itemName.equalsIgnoreCase(name)) {
             displayItem(temp);
             found = true;
         }
         temp = temp.next;
     }

     if (!found) {
         System.out.println("Item not found");
     }
 }

 // Calculate total inventory value
 public void calculateTotalValue() {
     ItemNode temp = head;
     double total = 0;

     while (temp != null) {
         total += temp.price * temp.quantity;
         temp = temp.next;
     }
     System.out.println("Total Inventory Value: ₹" + total);
 }

 // Sort inventory by Item Name
 public void sortByName(boolean ascending) {
     head = mergeSort(head, ascending, true);
     System.out.println("Inventory sorted by Item Name");
 }

 // Sort inventory by Price
 public void sortByPrice(boolean ascending) {
     head = mergeSort(head, ascending, false);
     System.out.println("Inventory sorted by Price");
 }

 // Merge Sort for linked list
 private ItemNode mergeSort(ItemNode node, boolean asc, boolean sortByName) {
     if (node == null || node.next == null)
         return node;

     ItemNode middle = getMiddle(node);
     ItemNode nextOfMiddle = middle.next;
     middle.next = null;

     ItemNode left = mergeSort(node, asc, sortByName);
     ItemNode right = mergeSort(nextOfMiddle, asc, sortByName);

     return sortedMerge(left, right, asc, sortByName);
 }

 // Merge two sorted lists
 private ItemNode sortedMerge(ItemNode a, ItemNode b, boolean asc, boolean sortByName) {
     if (a == null) return b;
     if (b == null) return a;

     boolean condition;
     if (sortByName) {
         condition = asc
                 ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
                 : a.itemName.compareToIgnoreCase(b.itemName) > 0;
     } else {
         condition = asc ? a.price <= b.price : a.price > b.price;
     }

     ItemNode result;
     if (condition) {
         result = a;
         result.next = sortedMerge(a.next, b, asc, sortByName);
     } else {
         result = b;
         result.next = sortedMerge(a, b.next, asc, sortByName);
     }
     return result;
 }

 // Find middle of linked list
 private ItemNode getMiddle(ItemNode node) {
     ItemNode slow = node, fast = node.next;

     while (fast != null && fast.next != null) {
         slow = slow.next;
         fast = fast.next.next;
     }
     return slow;
 }

 // Display all inventory items
 public void displayInventory() {
     if (head == null) {
         System.out.println("Inventory is empty");
         return;
     }

     ItemNode temp = head;
     System.out.println("ID  Name  Qty  Price");

     while (temp != null) {
         displayItem(temp);
         temp = temp.next;
     }
 }

 // Display a single item
 private void displayItem(ItemNode item) {
     System.out.println(item.itemId + "  " + item.itemName + "  "
             + item.quantity + "  ₹" + item.price);
 }
}

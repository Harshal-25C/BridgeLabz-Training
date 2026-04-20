package com.day10.OnlineTicketBookingbyTime;

class EventBST {
 private EventNode root;

 //Insert Event
 public void insert(int id, String name, int time) {
     root = insertRec(root, id, name, time);
 }

 private EventNode insertRec(EventNode root, int id, String name, int time) {
     if(root == null)
         return new EventNode(id, name, time);

     if(time < root.eventTime)
         root.left = insertRec(root.left, id, name, time);
     else
         root.right = insertRec(root.right, id, name, time);

     return root;
 }

 // Delete Event by Time
 public void delete(int time) {
     root = deleteRec(root, time);
 }

 private EventNode deleteRec(EventNode root, int time) {
     if(root == null) return null;

     if(time < root.eventTime)
         root.left = deleteRec(root.left, time);
     else if(time > root.eventTime)
         root.right = deleteRec(root.right, time);
     else{
         if(root.left == null) return root.right;
         if(root.right == null) return root.left;

         EventNode min = findMin(root.right);
         root.eventTime = min.eventTime;
         root.eventId = min.eventId;
         root.eventName = min.eventName;
         root.right = deleteRec(root.right, min.eventTime);
     }
     return root;
 }

 private EventNode findMin(EventNode node) {
     while (node.left != null)
         node = node.left;
     return node;
 }

 //Display Upcoming Events
 public void display() {
     System.out.println("\nUpcoming Events:");
     inorder(root);
 }

 private void inorder(EventNode root) {
     if(root != null) {
         inorder(root.left);
         System.out.println("ID: " + root.eventId +
                            ", Event: " + root.eventName +
                            ", Time: " + root.eventTime);
         inorder(root.right);
     }
 }
}

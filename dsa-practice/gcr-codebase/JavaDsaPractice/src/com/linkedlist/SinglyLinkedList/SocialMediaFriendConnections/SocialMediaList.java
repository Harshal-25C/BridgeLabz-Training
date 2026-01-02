package com.linkedlist.SinglyLinkedList.SocialMediaFriendConnections;

//Singly Linked List to manage Users
class SocialMediaList{
 private UserNode head;

 //Add new user to the system
 public void addUser(int id, String name, int age) {
     UserNode newUser = new UserNode(id, name, age);
     newUser.next = head;
     head = newUser;
 }

 //Find user by ID
 private UserNode findUserById(int id) {
     UserNode temp = head;
     while (temp != null) {
         if (temp.userId == id)
             return temp;
         temp = temp.next;
     }
     return null;
 }

 //Add friend connection between two users
 public void addFriend(int userId1, int userId2) {
     UserNode user1 = findUserById(userId1);
     UserNode user2 = findUserById(userId2);

     if (user1 == null || user2 == null) {
         System.out.println("User not found");
         return;
     }

     user1.friendHead = addFriendNode(user1.friendHead, userId2);
     user2.friendHead = addFriendNode(user2.friendHead, userId1);

     System.out.println("Friend connection added");
 }

 // Helper method to add friend ID to friend list
 private FriendNode addFriendNode(FriendNode head, int friendId) {
     FriendNode newNode = new FriendNode(friendId);
     newNode.next = head;
     return newNode;
 }

 // Remove friend connection
 public void removeFriend(int userId1, int userId2) {
     UserNode user1 = findUserById(userId1);
     UserNode user2 = findUserById(userId2);

     if (user1 == null || user2 == null) {
         System.out.println("User not found");
         return;
     }

     user1.friendHead = removeFriendNode(user1.friendHead, userId2);
     user2.friendHead = removeFriendNode(user2.friendHead, userId1);

     System.out.println("Friend connection removed");
 }

 // Helper method to remove friend ID
 private FriendNode removeFriendNode(FriendNode head, int friendId) {
     if (head == null)
         return null;

     if (head.friendId == friendId)
         return head.next;

     FriendNode temp = head;
     while (temp.next != null && temp.next.friendId != friendId) {
         temp = temp.next;
     }

     if (temp.next != null)
         temp.next = temp.next.next;

     return head;
 }

 // Display all friends of a user
 public void displayFriends(int userId) {
     UserNode user = findUserById(userId);

     if (user == null) {
         System.out.println("User not found");
         return;
     }

     System.out.print("Friends of " + user.name + ": ");
     FriendNode temp = user.friendHead;

     if (temp == null) {
         System.out.println("No friends");
         return;
     }

     while (temp != null) {
         System.out.print(temp.friendId + " ");
         temp = temp.next;
     }
     System.out.println();
 }

 // Find mutual friends between two users
 public void findMutualFriends(int userId1, int userId2) {
     UserNode user1 = findUserById(userId1);
     UserNode user2 = findUserById(userId2);

     if (user1 == null || user2 == null) {
         System.out.println("User not found");
         return;
     }

     System.out.print("Mutual Friends: ");
     FriendNode f1 = user1.friendHead;
     boolean found = false;

     while (f1 != null) {
         FriendNode f2 = user2.friendHead;
         while (f2 != null) {
             if (f1.friendId == f2.friendId) {
                 System.out.print(f1.friendId + " ");
                 found = true;
             }
             f2 = f2.next;
         }
         f1 = f1.next;
     }

     if (!found)
         System.out.print("None");

     System.out.println();
 }

 // Search user by ID or Name
 public void searchUser(int id, String name) {
     UserNode temp = head;

     while (temp != null) {
         if (temp.userId == id || temp.name.equalsIgnoreCase(name)) {
             System.out.println("User Found: " +
                     temp.userId + " " + temp.name + " " + temp.age);
             return;
         }
         temp = temp.next;
     }
     System.out.println("User not found");
 }

 // Count number of friends for each user
 public void countFriends() {
     UserNode temp = head;

     while (temp != null) {
         int count = 0;
         FriendNode f = temp.friendHead;

         while (f != null) {
             count++;
             f = f.next;
         }

         System.out.println(temp.name + " has " + count + " friends");
         temp = temp.next;
     }
 }
}


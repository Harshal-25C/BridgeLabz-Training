package com.linkedlist.SinglyLinkedList.SocialMediaFriendConnections;

//Node to store User information
class UserNode{
 int userId;
 String name;
 int age;
 FriendNode friendHead; 
 //Head of friend list
 UserNode next;
 // Pointer to next user

 //Constructor to initialize user details
 UserNode(int userId, String name, int age){
     this.userId = userId;
     this.name = name;
     this.age = age;
     this.friendHead = null;
     this.next = null;
 }
}


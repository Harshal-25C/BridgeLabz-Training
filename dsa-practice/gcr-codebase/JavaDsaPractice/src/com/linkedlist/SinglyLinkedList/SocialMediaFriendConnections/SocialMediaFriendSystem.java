package com.linkedlist.SinglyLinkedList.SocialMediaFriendConnections;

public class SocialMediaFriendSystem {
 public static void main(String[] args) {

     SocialMediaList sm = new SocialMediaList();

     sm.addUser(1, "Amit", 22);
     sm.addUser(2, "Neha", 21);
     sm.addUser(3, "Ravi", 23);
     sm.addUser(4, "Sneha", 20);

     sm.addFriend(1, 2);
     sm.addFriend(1, 3);
     sm.addFriend(2, 3);
     sm.addFriend(3, 4);

     sm.displayFriends(1);
     sm.findMutualFriends(1, 2);

     sm.searchUser(3, "");
     sm.countFriends();

     sm.removeFriend(1, 3);
     sm.displayFriends(1);
 }
}

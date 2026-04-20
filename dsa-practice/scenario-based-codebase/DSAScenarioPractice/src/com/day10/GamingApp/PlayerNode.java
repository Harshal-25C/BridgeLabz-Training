package com.day10.GamingApp;

//BST Node
class PlayerNode {
 int playerId;
 String name;
 int score;
 PlayerNode left, right;

 public PlayerNode(int playerId, String name, int score) {
     this.playerId = playerId;
     this.name = name;
     this.score = score;
     this.left = this.right = null;
 }
}

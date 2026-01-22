package com.day10.GamingApp;

class LeaderboardBST {

 private PlayerNode root;
 private int count = 0;

 // 1️ Insert or Update Player
 public void insertOrUpdate(int id, String name, int score) {
     root = insertRec(root, id, name, score);
 }

 private PlayerNode insertRec(PlayerNode root, int id, String name, int score) {
     if (root == null) {
         return new PlayerNode(id, name, score);
     }

     if (id == root.playerId) {
         root.score = score; // update score
         return root;
     }

     if (score < root.score) {
         root.left = insertRec(root.left, id, name, score);
     } else {
         root.right = insertRec(root.right, id, name, score);
     }
     return root;
 }

 // 2️ Display Top 10 Players
 public void displayTopPlayers() {
     count = 0;
     System.out.println("\n--- Top Players ---");
     displayReverseInorder(root);
     if(count == 0) {
         System.out.println("Leaderboard is empty.");
     }
 }

 private void displayReverseInorder(PlayerNode root) {
     if(root == null || count >= 10) return;

     displayReverseInorder(root.right);

     if(count < 10) {
         System.out.println(
             "Player ID: " + root.playerId +
             ", Name: " + root.name +
             ", Score: " + root.score
         );
         count++;
     }

     displayReverseInorder(root.left);
 }

 // 3️ Remove Player by ID
 public void removePlayer(int id) {
     root = removeRec(root, id);
 }

 private PlayerNode removeRec(PlayerNode root, int id) {
     if(root == null) return null;

     if(id < root.playerId) {
         root.left = removeRec(root.left, id);
     }else if (id > root.playerId) {
         root.right = removeRec(root.right, id);
     }else {
         // Node found
         if(root.left == null) return root.right;
         if(root.right == null) return root.left;

         PlayerNode successor = findMin(root.right);
         root.playerId = successor.playerId;
         root.name = successor.name;
         root.score = successor.score;
         root.right = removeRec(root.right, successor.playerId);
     }
     return root;
 }

 private PlayerNode findMin(PlayerNode root) {
     while(root.left != null) root = root.left;
     return root;
 }
}

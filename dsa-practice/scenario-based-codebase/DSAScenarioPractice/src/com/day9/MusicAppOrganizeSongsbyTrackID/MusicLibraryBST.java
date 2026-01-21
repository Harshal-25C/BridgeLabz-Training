package com.day9.MusicAppOrganizeSongsbyTrackID;

class MusicLibraryBST {

 private SongNode root;

 // Insert new track (BST ordered by title)
 public void insert(int trackId, String title, String artist) {
     root = insertRec(root, trackId, title, artist);
 }

 private SongNode insertRec(SongNode root, int trackId, String title, String artist) {
     if(root == null) {
         return new SongNode(trackId, title, artist);
     }

     if(title.compareToIgnoreCase(root.title) < 0) {
         root.left = insertRec(root.left, trackId, title, artist);
     }else if (title.compareToIgnoreCase(root.title) > 0) {
         root.right = insertRec(root.right, trackId, title, artist);
     }else {
         System.out.println("Duplicate song title not allowed!");
     }
     return root;
 }

 // 1️ Search by Track ID
 public void searchByTrackId(int trackId) {
     SongNode result = searchRec(root, trackId);
     if(result != null) {
         displaySong(result);
     }else {
         System.out.println("Track not found!");
     }
 }

 private SongNode searchRec(SongNode root, int trackId) {
     if(root == null) return null;

     if(root.trackId == trackId) return root;

     SongNode leftResult = searchRec(root.left, trackId);
     if(leftResult != null) {
    	 return leftResult;
     }

     return searchRec(root.right, trackId);
 }

 // 3️ Display songs alphabetically
 public void displayPlaylist() {
     if(root == null) {
         System.out.println("Playlist is empty.");
         return;
     }
     System.out.println("\nPlaylist (Alphabetical Order):");
     inorder(root);
 }

 private void inorder(SongNode root) {
     if(root!=null) {
         inorder(root.left);
         displaySong(root);
         inorder(root.right);
     }
 }

 private void displaySong(SongNode s) {
     System.out.println("Track ID: " + s.trackId + ", Title: " + s.title + ", Artist: " + s.artist);
 }
}

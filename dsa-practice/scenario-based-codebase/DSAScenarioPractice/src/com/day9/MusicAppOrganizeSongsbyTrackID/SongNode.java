package com.day9.MusicAppOrganizeSongsbyTrackID;

//BST Node
class SongNode {
 int trackId;
 String title;
 String artist;
 SongNode left, right;

 public SongNode(int trackId, String title, String artist) {
     this.trackId = trackId;
     this.title = title;
     this.artist = artist;
     this.left = this.right = null;
 }
}

package com.day1.LibraryOrganizer;

public class Book {
	private int bookId;
	private String title;
	private String author;
	private String genre;
	private boolean isAvailable;

	Book(int bookId, String title, String author, String genre) {
		// TODO Auto-generated constructor stub
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.isAvailable = true;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public int getBookId() {
		return bookId;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
    public String toString() {
        return "BookID=" + bookId +
               ", Title=" + title +
               ", Author=" + author +
               ", Genre=" + genre +
               ", Available=" + isAvailable;
    }
}

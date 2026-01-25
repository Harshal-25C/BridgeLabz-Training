package com.day2.PersonalMusicLibraryManager;

public class Song extends Media {

    private String duration;

    public Song(String title, String artist, String duration, String genre) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return title + " | " + artist + " | " + duration + " | " + genre;
    }
}

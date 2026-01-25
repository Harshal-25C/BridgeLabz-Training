package com.day2.PersonalMusicLibraryManager;

public abstract class Media {
    protected String title;
    protected String artist;
    protected String genre;

    public String getGenre() {
        return genre;
    }

    public String getArtist() {
        return artist;
    }
}

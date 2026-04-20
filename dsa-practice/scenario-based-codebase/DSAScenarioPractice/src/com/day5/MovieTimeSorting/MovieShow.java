package com.day5.MovieTimeSorting;

public class MovieShow {
    private String movieName;
    private int showTime; //24 hr format (eg, 1830)

    public MovieShow(String movieName, int showTime) {
        this.movieName=movieName;
        this.showTime=showTime;
    }

    public int getShowTime() {
        return showTime;
    }

    public String toString() {
        return movieName+" at "+showTime;
    }
}

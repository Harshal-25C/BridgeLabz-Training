package com.day8.TheaterShowListings;

class MovieShow {
    String movieName;
    int showTime; //24-hour format (e.g., 1430 = 2:30 PM)

    MovieShow(String movieName, int showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    @Override
    public String toString() {
        return movieName+" at "+showTime;
    }
}

package com.day5.MovieTimeSorting;
import java.util.*;

public class CinemaHouseApp {

    public static void main(String[] args) {

        List<MovieShow> shows = new ArrayList<>();
        shows.add(new MovieShow("Avatar", 1800));
        shows.add(new MovieShow("Inception", 1500));
        shows.add(new MovieShow("Interstellar", 2100));

        CinemaHouseSorter.bubbleSort(shows);

        for(MovieShow m:shows) {
            System.out.println(m);
        }
    }
}

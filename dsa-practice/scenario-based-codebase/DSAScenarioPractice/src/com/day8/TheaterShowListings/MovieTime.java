package com.day8.TheaterShowListings;
import java.util.*;

public class MovieTime {

    //Insertion Sort by showTime
    public static void insertionSort(ArrayList<MovieShow> shows) {
        for(int i=1; i<shows.size(); i++) {
            MovieShow key = shows.get(i);
            int j=i-1;

            while(j>=0 && shows.get(j).showTime>key.showTime) {
                shows.set(j+1, shows.get(j));
                j--;
            }
            shows.set(j+1, key);
        }
    }

    public static void main(String[] args) {
        ArrayList<MovieShow> shows = new ArrayList<>();

        shows.add(new MovieShow("Avatar", 1200));
        shows.add(new MovieShow("Inception", 1500));
        shows.add(new MovieShow("Interstellar", 1800));
        shows.add(new MovieShow("Oppenheimer", 1330));

        insertionSort(shows);

        System.out.println("Sorted Show Timings:");
        for(MovieShow s:shows) {
            System.out.println(s);
        }
    }
}

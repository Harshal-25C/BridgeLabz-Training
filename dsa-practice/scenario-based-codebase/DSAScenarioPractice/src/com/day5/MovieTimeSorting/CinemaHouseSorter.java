package com.day5.MovieTimeSorting;
import java.util.List;

public class CinemaHouseSorter {

    public static void bubbleSort(List<MovieShow> shows) {

        int n = shows.size();

        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {

                if (shows.get(j).getShowTime() > shows.get(j + 1).getShowTime()) {

                    MovieShow temp = shows.get(j);
                    shows.set(j, shows.get(j+1));
                    shows.set(j+1, temp);
                }
            }
        }
    }
}

package com.day6.SortArtistsbyRegistrationTime;

public class ArtExpo {
    public static void insertionSort(Artist[] artists) {

        for(int i=1; i<artists.length; i++) {

            Artist key = artists[i];
            int j = i-1;

            while(j >= 0 && artists[j].registrationTime > key.registrationTime) {
                artists[j+1] = artists[j];
                j--;
            }

            artists[j+1] = key;
        }
    }

    public static void main(String[] args) {

        Artist[] artists = {
            new Artist("Aarav", 10),
            new Artist("Meera", 5),
            new Artist("Rohan", 8),
            new Artist("Kavya", 12)
        };

        insertionSort(artists);

        System.out.println("Artists sorted by registration time:");
        for(Artist a:artists) {
            System.out.println(a);
        }
    }
}

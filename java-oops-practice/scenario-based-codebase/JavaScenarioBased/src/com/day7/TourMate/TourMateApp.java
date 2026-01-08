package com.day7.TourMate;

public class TourMateApp{
    public static void main(String[] args){

        Transport flight = new Transport(30000);
        Hotel hotel = new Hotel(20000);
        Activity activity = new Activity(10000);

        Trip domesticTrip = new DomesticTrip(
                "Goa", 5, flight, hotel, activity
        );

        Trip internationalTrip = new InternationalTrip(
                "Paris", 7, flight, hotel, activity
        );

        domesticTrip.book();
        System.out.println();

        internationalTrip.book();
    }
}

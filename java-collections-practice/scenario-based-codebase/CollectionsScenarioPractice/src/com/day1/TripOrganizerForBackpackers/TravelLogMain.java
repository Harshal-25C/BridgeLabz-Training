package com.day1.TripOrganizerForBackpackers;

import java.util.*;

public class TravelLogMain {

    public static void main(String[] args) {

        System.out.println("=== TravelLog Application Started ===");

        TravelLogService service = new TravelLogService();

        try {
            service.saveSampleTrips();

            List<Trip> trips = service.loadTrips();

            System.out.println("\n--- Trips Longer Than 5 Days ---");
            service.printLongTrips(trips);

            System.out.println("\n--- Unique Countries Visited ---");
            service.printUniqueCountries(trips);

            System.out.println("\n--- Top 3 Most Visited Cities ---");
            service.printTopCities(trips);

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

        System.out.println("=== TravelLog Application Finished ===");
    }
}

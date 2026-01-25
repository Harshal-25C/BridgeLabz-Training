package com.day1.TripOrganizerForBackpackers;

import java.io.*;
import java.util.*;

public class TravelLogService {

    private static final String FILE_NAME = "trips.dat";

    // 1️ Save sample trip entries (Serialization)
    public void saveSampleTrips() throws Exception {

        List<Trip> trips = new ArrayList<>();

        trips.add(new Trip("Paris", "France", 7, "Visited Eiffel Tower"));
        trips.add(new Trip("Rome", "Italy", 4, "Explored ancient monuments"));
        trips.add(new Trip("Paris", "France", 6, "Food, museums, and culture"));
        trips.add(new Trip("Berlin", "Germany", 3, "Historical places"));
        trips.add(new Trip("Tokyo", "Japan", 8, "Technology and tradition"));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
        oos.writeObject(trips);
        oos.close();
    }

    // 2️ Load trips from file (Deserialization)
    @SuppressWarnings("unchecked")
    public List<Trip> loadTrips() throws Exception {

        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream(FILE_NAME));
        List<Trip> trips = (List<Trip>) ois.readObject();
        ois.close();

        return trips;
    }

    // 3️ Print trips longer than 5 days
    public void printLongTrips(List<Trip> trips) {

        for(Trip trip : trips) {
            if(trip.durationDays > 5) {
                System.out.println(
                        trip.city + " (" + trip.durationDays + " days)"
                );
            }
        }
    }

    // 4️ Print unique countries visited
    public void printUniqueCountries(List<Trip> trips) {

        Set<String> countries = new HashSet<>();

        for(Trip trip : trips) {
            countries.add(trip.country);
        }

        for(String country : countries) {
            System.out.println(country);
        }
    }

    // 5️ Print top 3 most visited cities
    public void printTopCities(List<Trip> trips) {

        Map<String, Integer> cityCountMap = new HashMap<>();

        for(Trip trip : trips) {
            cityCountMap.put(
                    trip.city,
                    cityCountMap.getOrDefault(trip.city, 0) + 1
            );
        }

        List<Map.Entry<String, Integer>> cityList = new ArrayList<>(cityCountMap.entrySet());

        cityList.sort((a, b) -> b.getValue() - a.getValue());

        int limit = Math.min(3, cityList.size());
        for(int i=0; i<limit; i++) {
            Map.Entry<String, Integer> entry = cityList.get(i);
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}

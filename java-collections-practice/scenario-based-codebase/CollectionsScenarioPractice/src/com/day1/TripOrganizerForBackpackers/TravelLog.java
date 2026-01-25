package com.day1.TripOrganizerForBackpackers;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TravelLog {

    public static void main(String[] args) throws Exception {

        List<Trip> trips = new ArrayList<>();
        trips.add(new Trip("Paris", "France", 7, "Visited Eiffel Tower"));
        trips.add(new Trip("Rome", "Italy", 4, "Ancient history"));
        trips.add(new Trip("Paris", "France", 6, "Food and museums"));

        writeTrips(trips);
        List<Trip> storedTrips = readTrips();

        // Cities using Regex
        Pattern cityPattern = Pattern.compile("\\b[A-Z][a-z]+\\b");
        storedTrips.forEach(t -> {
            Matcher m = cityPattern.matcher(t.description);
            while (m.find()) System.out.println("City Found: " + m.group());
        });

        // Trips longer than 5 days
        storedTrips.stream()
                .filter(t -> t.durationDays > 5)
                .forEach(t -> System.out.println("Long Trip: " + t.city));

        // Unique countries
        Set<String> countries = new HashSet<>();
        storedTrips.forEach(t -> countries.add(t.country));
        System.out.println("Countries Visited: " + countries);

        // Top 3 most visited cities
        Map<String, Integer> cityCount = new HashMap<>();
        storedTrips.forEach(t -> cityCount.put(t.city, cityCount.getOrDefault(t.city, 0) + 1));

        cityCount.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(3)
                .forEach(System.out::println);
    }

    static void writeTrips(List<Trip> trips) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("trips.dat"));
        oos.writeObject(trips);
        oos.close();
    }

    static List<Trip> readTrips() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("trips.dat"));
        return (List<Trip>) ois.readObject();
    }
}

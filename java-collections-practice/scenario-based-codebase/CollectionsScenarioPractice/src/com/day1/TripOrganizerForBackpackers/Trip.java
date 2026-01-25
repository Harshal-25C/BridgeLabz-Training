package com.day1.TripOrganizerForBackpackers;
import java.io.Serializable;

class Trip implements Serializable {
    String city;
    String country;
    int durationDays;
    String description;

    Trip(String city, String country, int durationDays, String description) {
        this.city = city;
        this.country = country;
        this.durationDays = durationDays;
        this.description = description;
    }
}

package com.day1.EmergencyPatientNavigation;

public class Driver {
    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        route.displayUnits();
        route.findNearestAvailableUnit();

        route.removeUnit("Radiology");
        route.displayUnits();

        route.findNearestAvailableUnit();
    }
}

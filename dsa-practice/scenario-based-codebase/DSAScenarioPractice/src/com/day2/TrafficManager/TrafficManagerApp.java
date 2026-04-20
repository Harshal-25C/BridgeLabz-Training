package com.day2.TrafficManager;

public class TrafficManagerApp {
    public static void main(String[] args) {

        TrafficManager manager = new TrafficManager(3);

        manager.addVehicle("MH12AB1234");
        manager.addVehicle("MH12CD5678");
        manager.addVehicle("MH12EF9012");

        manager.printRoundabout();

        manager.removeVehicle("MH12AB1234");
        manager.printRoundabout();

        manager.removeVehicle("MH12CD5678");
        manager.removeVehicle("MH12EF9012");

        manager.printRoundabout();
    }
}

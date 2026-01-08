package com.day7.TourMate;

class DomesticTrip extends Trip{

    public DomesticTrip(String destination, int duration, Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book(){
        System.out.println("Domestic trip booked to "+destination);
        System.out.println("Budget: ₹"+totalBudget);
    }

    @Override
    public void cancel(){
        System.out.println("Domestic trip to "+destination+" cancelled.");
    }
}

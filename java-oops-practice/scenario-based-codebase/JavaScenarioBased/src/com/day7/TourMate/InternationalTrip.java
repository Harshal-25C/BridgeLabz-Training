package com.day7.TourMate;

class InternationalTrip extends Trip{

    private static final double VISA_CHARGE = 15000;

    public InternationalTrip(String destination, int duration,
                             Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
        totalBudget += VISA_CHARGE; // additional cost
    }

    @Override
    public void book(){
        System.out.println("International trip booked to " + destination);
        System.out.println("Includes visa & insurance");
        System.out.println("Budget: ₹" + totalBudget);
    }

    @Override
    public void cancel(){
        System.out.println("International trip to " + destination + " cancelled.");
    }
}

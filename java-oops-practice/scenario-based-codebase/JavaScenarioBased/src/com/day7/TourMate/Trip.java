package com.day7.TourMate;

abstract class Trip implements IBookable{

    protected String destination;
    protected int duration;

    protected Transport transport;
    protected Hotel hotel;
    protected Activity activity;

    protected double totalBudget;

    //Constructor for complete trip package
    public Trip(String destination, int duration, Transport transport, Hotel hotel, Activity activity) {
        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;

        calculateTotalBudget();
    }

    //Operator logic: hotel + transport + activities
    protected void calculateTotalBudget() {
        totalBudget = transport.getCost()
                    + hotel.getCost()
                    + activity.getCost();
    }

    public double getTotalBudget() {
        return totalBudget;
    }
}

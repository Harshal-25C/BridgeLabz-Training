package com.day5.EventEase;

abstract class Event {
 private final int eventId; //cannot be modified
 protected String eventName;
 protected String location;
 protected String date;
 protected int attendees;

 private double baseCost;

 //Constructor
 Event(int eventId, String eventName, String location, String date, int attendees, double baseCost) {
     this.eventId = eventId;
     this.eventName = eventName;
     this.location = location;
     this.date = date;
     this.attendees = attendees;
     this.baseCost = baseCost;
 }

 protected double calculateCost(double services, double discount) {
     return baseCost + services - discount;
 }

 abstract void schedule();
}

package com.day5.EventEase;

class ConferenceEvent extends Event implements ISchedulable{

 ConferenceEvent(int id, String name, String location, String date, int attendees) {
     super(id, name, location, date, attendees, 50000);
 }

 public void schedule() {
     System.out.println("Conference scheduled with speakers and sessions.");
 }

 public void reschedule(String newDate) {
     date = newDate;
     System.out.println("Conference rescheduled to " + date);
 }

 public void cancel() {
     System.out.println("Conference cancelled.");
 }
}

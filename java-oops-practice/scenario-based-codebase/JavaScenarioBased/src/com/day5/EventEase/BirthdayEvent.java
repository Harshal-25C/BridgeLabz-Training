package com.day5.EventEase;

class BirthdayEvent extends Event implements ISchedulable{

 BirthdayEvent(int id, String name, String location, String date, int guests){
     super(id, name, location, date, guests, 20000);
 }

 public void schedule() {
     System.out.println("Birthday event scheduled with decoration and cake.");
 }

 public void reschedule(String newDate) {
     date = newDate;
     System.out.println("Birthday event rescheduled to " + date);
 }

 public void cancel() {
     System.out.println("Birthday event cancelled.");
 }
}

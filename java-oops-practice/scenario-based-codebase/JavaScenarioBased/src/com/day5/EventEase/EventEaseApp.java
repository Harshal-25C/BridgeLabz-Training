package com.day5.EventEase;

public class EventEaseApp{
 public static void main(String[] args){

     ISchedulable event1 = new BirthdayEvent(
             101, "Aarav's Birthday", "Mumbai", "12-Aug-2026", 50);

     ISchedulable event2 = new ConferenceEvent(
             102, "Tech Summit", "Pune", "20-Sep-2026", 300);

     event1.schedule();
     event2.schedule();

     event1.reschedule("15-Aug-2026");
     event2.cancel();
 }
}

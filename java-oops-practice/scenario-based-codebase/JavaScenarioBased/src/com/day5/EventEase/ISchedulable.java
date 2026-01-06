package com.day5.EventEase;

interface ISchedulable {
 void schedule();
 void reschedule(String newDate);
 void cancel();
}

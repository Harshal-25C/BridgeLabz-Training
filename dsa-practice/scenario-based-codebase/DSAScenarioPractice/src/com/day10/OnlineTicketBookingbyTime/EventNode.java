package com.day10.OnlineTicketBookingbyTime;

//BST Node
class EventNode {
 int eventId;
 String eventName;
 int eventTime; //represents start time
 EventNode left, right;

 EventNode(int eventId, String eventName, int eventTime) {
     this.eventId = eventId;
     this.eventName = eventName;
     this.eventTime = eventTime;
 }
}

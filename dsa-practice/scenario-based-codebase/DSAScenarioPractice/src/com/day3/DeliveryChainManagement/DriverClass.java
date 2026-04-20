package com.day3.DeliveryChainManagement;

public class DriverClass {
	public static void main(String[] args) {

	    ParcelTracker tracker = new ParcelTracker();

	    tracker.trackParcel();

	    tracker.addCheckpoint("Shipped", "Customs Check");
	    tracker.trackParcel();

	    tracker.markLost();
	    tracker.trackParcel();
	}
}

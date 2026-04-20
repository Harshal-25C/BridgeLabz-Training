package com.day2.TrainCompanion;

public class TrainCompanionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrainCompanion train = new TrainCompanion();

        train.addCompartment("C1", false, false);
        train.addCompartment("C2", true, false);
        train.addCompartment("C3", false, true);
        train.addCompartment("C4", false, false);

        train.displayCurrent();
        train.moveNext();
        train.moveNext();

        train.searchService("wifi");

        train.removeCompartment("C3");
        train.movePrevious();
	}
}

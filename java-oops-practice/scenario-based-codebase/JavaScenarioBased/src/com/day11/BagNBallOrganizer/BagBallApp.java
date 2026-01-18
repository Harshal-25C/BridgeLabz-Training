package com.day11.BagNBallOrganizer;

public class BagBallApp {
    public static void main(String[] args) {
        Bag bag1 = new Bag(101, "Red", 2);

        Ball b1 = new Ball(1, "Blue", "Small");
        Ball b2 = new Ball(2, "Green", "Medium");
        Ball b3 = new Ball(3, "Yellow", "Large");

        bag1.addBall(b1);
        bag1.addBall(b2);
        bag1.addBall(b3); //will not be added

        bag1.displayInfo();
        bag1.displayBalls();

        bag1.removeBall(1);
        bag1.displayBalls();
    }
}

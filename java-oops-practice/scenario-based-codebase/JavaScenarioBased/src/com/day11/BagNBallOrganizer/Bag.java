package com.day11.BagNBallOrganizer;
import java.util.*;

class Bag implements Storable {
    private int id;
    private String color;
    private int capacity;
    private List<Ball> balls;

    public Bag(int id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    public void addBall(Ball ball) {
        if(balls.size() < capacity) {
            balls.add(ball);
            System.out.println("Ball added to bag.");
        }else {
            System.out.println("Bag is full! Cannot add more balls.");
        }
    }

    public void removeBall(int ballId) {
        balls.removeIf(ball -> ball.getId() == ballId);
    }

    public void displayBalls() {
        if(balls.isEmpty()) {
            System.out.println("No balls in the bag.");
        }
        for(Ball b:balls) {
            b.displayInfo();
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Bag ID: "+id+", Color: "+color+
                ", Ball Count: "+balls.size()+"/"+capacity);
    }
}

package com.day11.BagNBallOrganizer;

class Ball implements Storable {
    private int id;
    private String color;
    private String size;

    public Ball(int id, String color, String size) {
        this.id=id;
        this.color = color;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    @Override
    public void displayInfo() {
        System.out.println("Ball ID: "+id+", Color: "+color+", Size: "+size);
    }
}

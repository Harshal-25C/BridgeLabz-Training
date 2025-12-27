package com.constructorandaccessmodifiers.levelone;

public class Circle{

	double radius;

    //Default constructor
    Circle(){
    	//Calls parameterized constructor with default radius
        this(1.0);
    }

    //Parameterized constructor
    Circle(double radius){
        this.radius = radius;
    }

    //Method to calculate area
    double area(){
        return Math.PI *radius*radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
    }

    public static void main(String[] args) {
    	//default radius
        Circle c1 = new Circle(); 
        c1.display();

        System.out.println();

        //user-provided radius
        Circle c2 = new Circle(5.0);
        c2.display();
    }

}

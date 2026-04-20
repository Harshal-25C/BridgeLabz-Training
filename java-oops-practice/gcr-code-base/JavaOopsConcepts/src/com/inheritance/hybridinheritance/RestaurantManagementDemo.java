package com.inheritance.hybridinheritance;

public class RestaurantManagementDemo{
    public static void main(String[] args){

        Worker chef = new Chef("Rohit", 101);
        Worker waiter = new Waiter("Aman", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}

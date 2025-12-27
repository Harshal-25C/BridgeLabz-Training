package com.constructorandaccessmodifiers.levelone;

public class HotelBooking{

	String guestName;
    String roomType;
    int nights;

    //Default constructor
    HotelBooking(){
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    //Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    //Copy constructor
    HotelBooking(HotelBooking hb){
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    void displayBooking(){
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args){
        HotelBooking booking1 = new HotelBooking();
        booking1.displayBooking();

        System.out.println();

        HotelBooking booking2 = new HotelBooking("Harsh", "Deluxe", 3);
        booking2.displayBooking();

        System.out.println();

        //Copy
        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.displayBooking();
    }

}

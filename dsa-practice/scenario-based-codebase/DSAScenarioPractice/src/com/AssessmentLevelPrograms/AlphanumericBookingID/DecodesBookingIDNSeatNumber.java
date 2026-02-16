package com.AssessmentLevelPrograms.AlphanumericBookingID;
import java.util.*;

import java.util.*;

class BookingDecoder {

    private String bookingId;

    public BookingDecoder(String bookingId) {
        this.bookingId = bookingId;
    }

    public void decodeBooking() {

        //Condition 1: Check length
        if(bookingId == null || bookingId.length() != 10) {
            System.out.println("Invalid Input");
            return;
        }

        //Extract seat count (6th & 7th characters → index 5,6)
        String seatCountStr = bookingId.substring(5, 7);

        // Check if seat count is numeric
        if(!seatCountStr.matches("[0-9]{2}")) {
            System.out.println("Invalid Count");
            return;
        }

        int seatCount = Integer.parseInt(seatCountStr);

        //Check seat count range
        if(seatCount < 1 || seatCount > 10) {
            System.out.println("Invalid Count");
            return;
        }

        // Extract coach letter (8th character → index 7)
        char coach = bookingId.charAt(7);

        // Extract starting seat number (last 2 characters)
        String startSeatStr = bookingId.substring(8, 10);

        // Validate coach and seat number format
        if(!Character.isLetter(coach) || !startSeatStr.matches("[0-9]{2}")) {
            System.out.println("Invalid Seat Number");
            return;
        }

        int startSeat = Integer.parseInt(startSeatStr);

        for(int i=0; i<seatCount; i++) {
            System.out.println(coach + String.format("%02d", startSeat + i));
        }
    }
}

public class DecodesBookingIDNSeatNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ten-digit alphanumeric booking ID: ");
        String input = sc.nextLine();

        BookingDecoder decoder = new BookingDecoder(input);
        decoder.decodeBooking();

    }
}

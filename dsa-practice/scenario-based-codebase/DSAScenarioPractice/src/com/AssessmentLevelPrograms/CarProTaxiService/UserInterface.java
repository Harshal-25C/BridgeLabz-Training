package com.AssessmentLevelPrograms.CarProTaxiService;
import java.util.*;
import java.text.*;

public class UserInterface {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);

        BookCabMain bookCabMain = new BookCabMain();
        Map<String, Date> bookingMap = new HashMap<>();

        System.out.println("Enter number of bookings to be added");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the Booking details (Booking Id:Date of Booking)");

        for(int i=0; i<n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(":");

            String bookingId = parts[0];
            Date bookingDate = sdf.parse(parts[1]);

            bookingMap.put(bookingId, bookingDate);
        }

        bookCabMain.setBookingMap(bookingMap);

        System.out.println("Enter the date to check the booking");
        Date searchDate = sdf.parse(sc.nextLine());

        List<String> bookingIds =
                bookCabMain.findCabBookingIdsForTheBookingDate(searchDate);

        if(bookingIds.isEmpty()) {
            System.out.println("No bookings were booked");
        }else {
            System.out.println("Booking Ids booked on the "+ sdf.format(searchDate) + " are by");

            for(String id : bookingIds) {
                System.out.println(id);
            }
        }

    }
}

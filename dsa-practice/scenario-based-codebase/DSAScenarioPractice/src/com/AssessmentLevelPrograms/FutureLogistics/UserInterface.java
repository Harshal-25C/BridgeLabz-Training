package com.AssessmentLevelPrograms.FutureLogistics;

import java.util.*;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Utility utility = new Utility();

        System.out.println("Enter the Goods Transport details");
        String input = sc.nextLine();

        String transportId = input.split(":")[0];

        if(!utility.validateTransportId(transportId)) {
            System.out.println("Transport id " + transportId + " is invalid");
            System.out.println("Please provide a valid record");
            return;
        }

        GoodsTransport gt = utility.parseDetails(input);
        String type = utility.findObjectType(gt);

        System.out.println("\nTransporter id : " + gt.getTransportId());
        System.out.println("Date of transport : " + gt.getTransportDate());
        System.out.println("Rating of the transport : " + gt.getTransportRating());

        if(type.equals("BrickTransport")) {
            BrickTransport bt = (BrickTransport) gt;
            System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
            System.out.println("Brick price : " + bt.getBrickPrice());
            System.out.println("Vehicle for transport : " + bt.vehicleSelection());
            System.out.println("Total charge : " + bt.calculateTotalCharge());
        }else {
            TimberTransport tt = (TimberTransport) gt;
            System.out.println("Type of the timber : " + tt.getTimberType());
            System.out.println("Timber price per kilo : " + tt.getTimberPrice());
            System.out.println("Vehicle for transport : " + tt.vehicleSelection());
            System.out.println("Total charge : " + tt.calculateTotalCharge());
        }
    }
}

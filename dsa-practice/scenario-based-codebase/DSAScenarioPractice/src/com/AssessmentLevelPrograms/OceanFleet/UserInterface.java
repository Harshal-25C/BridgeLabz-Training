package com.AssessmentLevelPrograms.OceanFleet;
import java.util.*;

public class UserInterface{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VesselUtil util = new VesselUtil();

        System.out.println("Enter the number of vessels to be added");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Enter vessel details");

        for (int i = 0; i < n; i++) {

            String input = sc.nextLine();
            String[] parts = input.split(":");

            String id = parts[0];
            String name = parts[1];
            double speed = Double.parseDouble(parts[2]);
            String type = parts[3];

            Vessel v = new Vessel(id, name, speed, type);
            util.addVesselPerformance(v);
        }

        System.out.println("Enter the Vessel Id to check speed");
        String searchId = sc.nextLine();

        Vessel found = util.getVesselById(searchId);

        if(found != null) {
            System.out.println(found.getVesselId() + " | "
                    + found.getVesselName() + " | "
                    + found.getVesselType() + " | "
                    + found.getAverageSpeed() + " knots");
        }else {
            System.out.println("Vessel Id " + searchId + " not found");
        }

        System.out.println("High performance vessels are");

        List<Vessel> highList = util.getHighPerformanceVessels();

        for(Vessel v : highList) {
            System.out.println(v.getVesselId() + " | "
                    + v.getVesselName() + " | "
                    + v.getVesselType() + " | "
                    + v.getAverageSpeed() + " knots");
        }
	}
}

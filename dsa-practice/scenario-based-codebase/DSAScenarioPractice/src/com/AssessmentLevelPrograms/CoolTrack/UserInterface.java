package com.AssessmentLevelPrograms.CoolTrack;
import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DataCenterUtil dcu = new DataCenterUtil();
		
		System.out.println("Enter the number of data centers to be added");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter data center details");
		for(int i=0; i<n; i++) {
			String str = sc.nextLine();
			
			String[] input = str.split(":");
			DataCenter dc = new DataCenter(
					input[0],
					input[1],
					input[2],
					Double.parseDouble(input[3])
			);
			
			dcu.addDataCenter(dc);
		}
			
		System.out.println("Enter the Data Center ID to get details");
		String strId = sc.nextLine();
			
		DataCenter id = dcu.getDataCenterById(strId);
			
		if(id == null) {
			System.out.println("DataCenter Not Found for the ID "+strId);
		}else {
			System.out.println(id.getDataCenterId()+" | "
					+id.getLocation()+" | "
					+id.getSupervisorName()+" | "
					+id.getCoolingPowerUsage());
		}
			
		System.out.println("Data Centers with maximum cooling power usage");
		List<DataCenter> lk = dcu.getDataCentersWithMaximumCoolingPowerUsage();
			
		for(DataCenter dk : lk) {
			System.out.println(dk.getDataCenterId()+" | "
					+dk.getLocation()+" | "
					+dk.getSupervisorName()+" | "
					+dk.getCoolingPowerUsage());
		}
	}
}

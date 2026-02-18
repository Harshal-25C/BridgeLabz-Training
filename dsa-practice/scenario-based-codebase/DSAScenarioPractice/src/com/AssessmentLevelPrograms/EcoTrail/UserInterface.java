package com.AssessmentLevelPrograms.EcoTrail;
import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TrailUtil tu = new TrailUtil();
		
		System.out.println("Enter the number of trails to be added");
		int n = Integer.parseInt(sc.nextLine());
		
		String id ="";
		String name ="";
		String region = "";
		String difficulty = "";
		int hikeCount = 0;
		System.out.println("Enter trail details");
		for(int i=0; i<n; i++) {
			String str = sc.nextLine();
			
			String input[] = str.split(":");
			
			id = input[0];
			name = input[1];
			region = input[2];
			difficulty = input[3];
			hikeCount = Integer.parseInt(input[4]);
			
			Trail t = new Trail(id, name, region, difficulty, hikeCount);
			tu.addTrailRecord(t);
		}
		
		System.out.println("Enter the Trail Id to check hike status");
		String searchTrailId = sc.nextLine();
		
		Trail found = tu.getTrailById(searchTrailId);
		
		if(found == null) {
			System.out.println(searchTrailId+" was not found!");
		}else {
			System.out.println(found.getTrailId()+
					" | "+found.getName()+
					" | "+found.getRegion()+
					" | "+found.getDifficulty()+
					" | "+found.getHikeCount()+" hikes");
		}
		
		System.out.println("\nMost hiked trails are");
		Set<Trail> mostHiked = tu.getMostHikedTrails();
		
		for(Trail tl : mostHiked) {
			System.out.println(tl.getTrailId()+
					" | "+tl.getName()+
					" | "+tl.getRegion()+
					" | "+tl.getDifficulty()+
					" | "+tl.getHikeCount()+" hikes");
		}
		
		System.out.println("\nRegion-wise hike counts");
		Map<String, Integer> mp = tu.getHikeCountByRegion(region, hikeCount);
		
		for(Map.Entry<String, Integer> e : mp.entrySet()) {
			System.out.println(e.getKey()+": "+e.getValue()+" hikes");
		}
		
		System.out.println("\nTrails grouped by difficulty");
		Map<String, List<Trail>> mp2 = tu.groupTrailsByDifficulty();
		
		for(Map.Entry<String, List<Trail>> e : mp2.entrySet()) {
			System.out.println(e.getKey());
			for(Trail tl : e.getValue()) {
				System.out.println(tl.getTrailId()+
						" | "+tl.getName()+
						" | "+tl.getRegion()+
						" | "+tl.getDifficulty()+
						" | "+tl.getHikeCount()+" hikes");
			}
		}
		
		System.out.println("\nEnter Trail Id to update hikes and additional hikes");
		String updateTrailId = sc.next();
		int additionalHikes= sc.nextInt();
		
		Trail found2 = tu.getTrailById(updateTrailId);
		
		boolean isFound=tu.updateHikeCount(updateTrailId, additionalHikes);
		if(isFound == true) {
			System.out.println("Updated "+updateTrailId+" by " +additionalHikes+" hikes");
			System.out.println(found2.getTrailId()+
					" | "+found2.getName()+
					" | "+found2.getRegion()+
					" | "+found2.getDifficulty()+
					" | "+found2.getHikeCount()+" hikes");
		}else {
			System.out.println(updateTrailId+" was not found!");
		}
		
		
		System.out.println("\nFilter trails by region and difficulty");
		String filterRegion = sc.next();
		String filterDifficulty = sc.next();
		
		List<Trail> filterBy = tu.filterTrails(filterRegion, filterDifficulty);
		
		for(Trail fl : filterBy) {
			System.out.println(fl.getTrailId()+
					" | "+fl.getName()+
					" | "+fl.getRegion()+
					" | "+fl.getDifficulty()+
					" | "+fl.getHikeCount()+" hikes");
		}
		
		
		System.out.println("\nEnter the number for Top-N Trails per Region");
		int n2 = sc.nextInt();
		System.out.println("Top "+n2+" trails per region");
		
		
	    Map<String, Trail> topMap = tu.getTopTrailsByRegion();

	    for(String region2: topMap.keySet()) {

		    System.out.println(region2);

		    Trail t = topMap.get(region2);

		    System.out.println(
		        t.getTrailId() + " | " +
		        t.getName() + " | " +
		        t.getRegion() + " | " +
		        t.getDifficulty() + " | " +
		        t.getHikeCount() + " hikes"
		    );
		}

	    Map<String, DifficultyStats> statsMap = tu.getDifficultyStats();

	    System.out.println("Difficulty statistics");

	    for(String difficulty2 : statsMap.keySet()) {

	        DifficultyStats s = statsMap.get(difficulty2);

	        System.out.println(
	            difficulty2 + ": count=" + s.count +
	            ", totalHikes=" + s.totalHikes +
	            ", averageHikes=" + (int)s.getAverage()
	        );
	    }

	}
}

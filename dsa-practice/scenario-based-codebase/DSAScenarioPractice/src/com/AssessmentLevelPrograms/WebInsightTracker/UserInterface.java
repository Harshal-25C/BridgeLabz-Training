package com.AssessmentLevelPrograms.WebInsightTracker;
import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		WebInsightBusinessLogic wi = new WebInsightBusinessLogic();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. Add Insight");
			System.out.println("2. Remove Insight");
			System.out.println("3. Total Clicks");
			System.out.println("4. Site With Most Visitors");
			System.out.println("5. Sort By Visitors");
			System.out.println("6. Group By Region");
			System.out.println("7. Exit");
			System.out.println("\nEnter your choice: ");
			
			int n = sc.nextInt();
			switch(n) {
			    case 1:
			    	System.out.println("Enter the site ID: ");
			    	String siteId = sc.next();
			    	System.out.println("Enter the region: ");
			    	String region = sc.next();
			    	System.out.println("Enter daily visitors");
			    	int dailyVisitors = sc.nextInt();
			    	System.out.println("Enter total clicks");
			    	double totalClicks = sc.nextDouble();
			    	
			    	WebInsight wb =  new WebInsight(siteId, region, dailyVisitors, totalClicks);
			    	wi.addInsight(wi.insightMap, wb);
			    	System.out.println("Data Entered Successfully!");
			    	break;
			    	
			    case 2:
			    	System.out.println("Enter Site ID for remove: ");
			    	String removeSiteId = sc.next();
			    	
			    	wi.removeInsight(wi.insightMap, removeSiteId);
			    	break;
			    	
			    case 3:
			    	System.out.println("Total Clicks : ");
			    	double db = wi.getTotalClicks(wi.insightMap);
			    	System.out.println(db);
			    	break;
			    	
			    case 4:
			    	System.out.println("The site with most visitors is: ");
			    	WebInsight mostVisitors = wi.getSiteWithMostVisitors(wi.insightMap);
			    	System.out.println(mostVisitors.getSiteId());
			    	break;
			    	
			    case 5:
			    	System.out.println("Sort using visitors: ");
			    	List<WebInsight> lwb = wi.getInsightSortedByVisitors(wi.insightMap);
			    	for(WebInsight w : lwb) {
			    		System.out.println(w.getSiteId()+ " | "+
			    	                       w.getRegion()+" | "+
			    				           w.getDailyVisitors()+" | "+
			    				           w.getTotalClicks()+" | ");
			    	}
			    	break;
			    	
			    case 6:
			    	Map<String, List<WebInsight>> mp = wi.groupByRegion(wi.insightMap);
			    	for(Map.Entry<String, List<WebInsight>> e : mp.entrySet()) {
			    		System.out.println(e.getKey());
			    		for(WebInsight w : e.getValue()) {
			    			System.out.println(w.getSiteId()+ " | "+
		    	                       w.getRegion()+" | "+
		    				           w.getDailyVisitors()+" | "+
		    				           w.getTotalClicks()+" | ");
			    		}
			    	}
			    	break;
			    	
			    case 7:
			    	System.out.println("Thank you for using the application");
			    	System.exit(0);
			    	break;
			    default:
			    	System.out.println("Number should be between 1 to 7");
			    	System.exit(0);
			    	break;
			}
			
		}while(true);
	}
}

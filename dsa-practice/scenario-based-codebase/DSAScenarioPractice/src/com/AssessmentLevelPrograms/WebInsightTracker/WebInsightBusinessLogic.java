package com.AssessmentLevelPrograms.WebInsightTracker;
import java.util.*;
import java.util.stream.*;

public class WebInsightBusinessLogic {
	
	Map<String, WebInsight> insightMap = new LinkedHashMap<>();
	public Map<String, WebInsight> getInsightMap(){
		return insightMap;
	}
	public void setInsightMap(Map<String, WebInsight> insightMap) {
		this.insightMap = insightMap;
	}
	
	public void addInsight(Map<String, WebInsight> insightMap, WebInsight insight) {
		insightMap.put(insight.getSiteId(), insight);
	}
	
	public void removeInsight(Map<String, WebInsight> insightMap, String siteId){
		Map<String, WebInsight> mp = new LinkedHashMap<>();
		insightMap.remove(siteId);
	}
	
	public double getTotalClicks(Map<String, WebInsight> insightMap) {
		double total = 0;
		
		for(Map.Entry<String, WebInsight> mp : insightMap.entrySet()) {
			total += mp.getValue().getTotalClicks();
		}
		
		return total;
	}
	
	public WebInsight getSiteWithMostVisitors(Map<String, WebInsight> insightMap) {
		return insightMap.values().stream()
				.max(Comparator.comparingInt(WebInsight::getDailyVisitors))
				.orElse(null);
	}
	
	public List<WebInsight> getInsightSortedByVisitors(Map<String, WebInsight> insightMap){
		return insightMap.values()
				.stream().sorted(Comparator.comparingInt(WebInsight::getDailyVisitors)).toList();
	}
	
	public Map<String, List<WebInsight>> groupByRegion(Map<String, WebInsight> insightMap){
		return insightMap.values().stream()
				.collect(Collectors.groupingBy(WebInsight::getRegion));
	}
	
	
}

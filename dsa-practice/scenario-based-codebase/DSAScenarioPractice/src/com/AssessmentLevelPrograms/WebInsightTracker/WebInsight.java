package com.AssessmentLevelPrograms.WebInsightTracker;

public class WebInsight {
	private String siteId;
	private String region;
	private int dailyVisitors;
	private double totalClicks;
	
	WebInsight(){}
	
	public WebInsight(String siteId, String region, int dailyVisitors, double totalClicks) {
		this.siteId = siteId;
		this.region = region;
		this.dailyVisitors = dailyVisitors;
		this.totalClicks = totalClicks;
	}
	
	public String getSiteId() { return siteId; }
	public String getRegion() { return region; }
	public int getDailyVisitors() { return dailyVisitors; }
	public double getTotalClicks() { return totalClicks; }
	
	public void setSiteId(String siteId) {this.siteId = siteId; }
	public void setRegion(String region) {this.region = region; }
	public void setDailyVisitors(int dailyVisitors) {this.dailyVisitors = dailyVisitors; }
	public void setTotalClicks(double totalClicks) {this.totalClicks = totalClicks; }
	
}

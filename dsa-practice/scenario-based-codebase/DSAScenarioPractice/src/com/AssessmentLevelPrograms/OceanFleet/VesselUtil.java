package com.AssessmentLevelPrograms.OceanFleet;
import java.util.*;

public class VesselUtil extends Vessel{
 
	private List<Vessel> vesselList = new ArrayList<>();
	
	private List<Vessel> getVesselList(){
		return vesselList;
	}
	
	public void addVesselPerformance(Vessel vessel) {
		
		if(!vesselList.contains(vessel)) {
			vesselList.add(vessel);
		}
	}
	
	public Vessel getVesselById(String vesselId) {
		for(Vessel v: vesselList) {
			if(v.getVesselId().equals(vesselId)) {
				return v;
			}
		}
		return null;
	}
	
	public List<Vessel> getHighPerformanceVessels(){
		
		List<Vessel> result = new ArrayList<>();
		
		double avgSpeed = Double.MIN_VALUE;
		
		for(Vessel v : vesselList) {
			if(v.getAverageSpeed() > avgSpeed) {
				avgSpeed = v.getAverageSpeed();
			}
		}
		
		//avgSpeed = Math.max(vessel.getAverageSpeed(), avgSpeed);
		
		for(Vessel v : vesselList) {
			if(v.getAverageSpeed() == avgSpeed) {
				result.add(v);
			}
		}
		
		return result;
	}
}

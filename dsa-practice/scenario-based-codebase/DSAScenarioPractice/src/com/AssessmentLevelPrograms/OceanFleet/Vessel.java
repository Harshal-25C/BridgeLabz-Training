package com.AssessmentLevelPrograms.OceanFleet;

public class Vessel {
	protected String vesselId;
	protected String vesselName;
	protected double averageSpeed;
	protected String vesselType;
	
	Vessel(){}
	Vessel(String vesselId, String vesselName, double averageSpeed, String vesselType){
		this.vesselId = vesselId;
		this.vesselName = vesselName;
		this.averageSpeed = averageSpeed;
		this.vesselType = vesselType;
	}
	
	public String getVesselId() {
		return vesselId;
	}
	public String getVesselName() {
		return vesselName;
	}
	public Double getAverageSpeed() {
		return averageSpeed;
	}
	public String getVesselType() {
		return vesselType;
	}
	
	public void setVesselId() {
		this.vesselId = vesselId;
	}
	public void setVesselName() {
		this.vesselName = vesselName;
	}
	public void setAverageSpeed() {
		this.averageSpeed = averageSpeed;
	}
	public void vesselType() {
		this.vesselType = vesselType;
	}
	
	@Override
	public String toString() {
		return vesselId+" | "+vesselName+" | "+averageSpeed+" | "+vesselType;
	}
}

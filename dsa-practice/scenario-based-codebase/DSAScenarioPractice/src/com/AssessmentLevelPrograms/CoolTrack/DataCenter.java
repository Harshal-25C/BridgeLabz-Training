package com.AssessmentLevelPrograms.CoolTrack;

public class DataCenter {
	protected String dataCenterId;
	protected String location;
	protected String supervisorName;
	protected double coolingPowerUsage;
	
	DataCenter() {}
	DataCenter(String dataCenterId, String location, String supervisorName, double coolingPowerUsage){
		this.dataCenterId = dataCenterId;
		this.location = location;
		this.supervisorName = supervisorName;
		this.coolingPowerUsage = coolingPowerUsage;
	}
	
	public String getDataCenterId() {
		return dataCenterId;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getSupervisorName() {
		return supervisorName;
	}
	
	public double getCoolingPowerUsage() {
		return coolingPowerUsage;
	}
	
	public void setDataCenterId(String dataCenterId) {
		this.dataCenterId = dataCenterId;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}
	public void setCoolingPowerUsage(double coolingPowerUsage) {
		this.coolingPowerUsage = coolingPowerUsage;
	}
	
	
}

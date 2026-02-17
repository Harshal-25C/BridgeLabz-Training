package com.AssessmentLevelPrograms.CoolTrack;
import java.util.*;

public class DataCenterUtil {
	private Set<DataCenter>dataCenterSet = new LinkedHashSet<>();
	
	public Set<DataCenter> getDataCenter(){
		return dataCenterSet;
	}
	public void setDataCenter(Set<DataCenter> hk) {
		this.dataCenterSet = (Set<DataCenter>) hk;
	}
	
	public void addDataCenter(DataCenter dataCenter){
		dataCenterSet.add(dataCenter);
	}
	
	public DataCenter getDataCenterById(String dataCenterId){
		for(DataCenter d : dataCenterSet) {
			if(d.getDataCenterId().equals(dataCenterId)) {
				return d;
			}
		}
		return null;
	}
	
	public List<DataCenter> getDataCentersWithMaximumCoolingPowerUsage(){
		List<DataCenter> hk = new ArrayList<>();
		
		double maxCoolingUse = Double.MIN_VALUE;
		
		for(DataCenter d : dataCenterSet) {
			if(d.getCoolingPowerUsage() > maxCoolingUse) {
				maxCoolingUse = d.getCoolingPowerUsage();
			}
		}
		
		for(DataCenter d : dataCenterSet) {
			if(d.getCoolingPowerUsage() == maxCoolingUse) {
				hk.add(d);
			}
		}
		return hk;
	}
}

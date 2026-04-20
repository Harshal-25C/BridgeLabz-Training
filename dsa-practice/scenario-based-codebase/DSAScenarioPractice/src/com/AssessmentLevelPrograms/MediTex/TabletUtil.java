package com.AssessmentLevelPrograms.MediTex;
import java.util.*;
import java.util.stream.*;
public class TabletUtil {
	public List<Tablet> retrieveTabletsByBrand(Stream<Tablet> tabletStream, String brand){
		return tabletStream.filter(e -> e.getBrand().equals(brand))
				.collect(Collectors.toList());
	}
	
	public List<String> getTabletAboveMg(Stream<Tablet> tableStream, int mg){
		return tableStream.filter(e -> e.getMg()>=(mg))
				.map(Tablet::getName)
				.collect(Collectors.toList());
	}
}

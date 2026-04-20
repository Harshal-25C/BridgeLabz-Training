package com.AssessmentLevelPrograms.MediTex;
import java.time.LocalDate;
import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		TabletUtil tu = new TabletUtil();
		Scanner sc = new Scanner(System.in);
		
		List<Tablet> tabletList = new ArrayList<>();
		
		System.out.println("Enter the number of tablets");
		int t = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the tablet details");
		for(int i=0; i<t; i++) {
			String tb = sc.nextLine();
			String parts[] = tb.split(":");
			
			String name = parts[0];
			String brand = parts[1];
			LocalDate expiryDate = LocalDate.parse(parts[2]);
			int mg = Integer.parseInt(parts[3]);
			double price = Double.parseDouble(parts[4]);
			
			tabletList.add(new Tablet(name, brand, expiryDate, mg, price));
		}
		
		System.out.println("Enter the brand name");
		String searchBrand = sc.nextLine();
		
		List<Tablet> scB = tu.retrieveTabletsByBrand(tabletList.stream(), searchBrand);
		
		if(scB.isEmpty()) {
			System.out.println("No tablet found for this brand "+searchBrand);
		}else {
			System.out.println("Tablets by brand "+searchBrand+" are");
			scB.forEach(System.out::println);
		}
		
		System.out.println("Enter the minimum mg");
		int minMg = Integer.parseInt(sc.nextLine());
		
		List<String> minmgList = tu.getTabletAboveMg(tabletList.stream(), minMg);
		
		if(minmgList.isEmpty()) {
			System.out.println("No tablet found for this mg "+minMg);
		}else {
			System.out.println("Tablets with a minimum mg of "+minMg+" are");
			minmgList.forEach(System.out::println);
		}
		
	}
}

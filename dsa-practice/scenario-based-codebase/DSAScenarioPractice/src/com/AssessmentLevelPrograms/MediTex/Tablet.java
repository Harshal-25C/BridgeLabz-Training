package com.AssessmentLevelPrograms.MediTex;
import java.time.LocalDate;

public class Tablet {
	private String name;
	private String brand;
	private LocalDate expiryDate;
	private int mg;
	private double pricePerTablet;
	
	Tablet(String name, String brand, LocalDate expiryDate, int mg, double pricePerTablet){
		this.name = name;
		this.brand = brand;
		this.expiryDate = expiryDate;
		this.mg = mg;
		this.pricePerTablet = pricePerTablet;
	}
	
	public String getName() { return name; }
	public String getBrand() { return brand; }
	public LocalDate getExpiryDate() { return expiryDate; }
	public int getMg() { return mg; }
	public double getPricePerTablet() { return pricePerTablet; }
	
	public void setName(String name) { this.name = name; }
	public void setBrand(String brand) { this.brand = brand; }
	public void setExpiryDate(LocalDate expiryDate) { this.expiryDate = expiryDate; }
	public void setMg(int mg) { this.mg = mg; }
	public void setPricePerTablet(double pricePerTablet) { this.pricePerTablet = pricePerTablet; }
	
	@Override
	public String toString() {
		return name+" | "+brand+" | "+expiryDate+" | "+mg+" | "+pricePerTablet;
	}
}

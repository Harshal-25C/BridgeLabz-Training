package com.day9.SmartHomeDeviceManager;

public class HomeNestApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device[] devices = new Device[] {
	        new Light(101),
	        new Camera(102),
	        new Thermostat(103),
	        new clock(104)
	    };

	    for(Device d : devices){
	        d.turnOn();
	        d.reset(); //Polymorphic call
	            
	        System.out.println("Monthly Usage: "+d.calculateMonthlyUsage(100)+" units");
	        System.out.println("----------------------");
	    }
	}
}

package com.day2.SmartHomeAutomationSystem;

//AC device
class AC extends Appliance{

 AC(){
     super(120);
 }

 public void turnOn(){
     setPower(true);
     System.out.println("AC cooling started");
 }

 public void turnOff(){
     setPower(false);
     System.out.println("AC turned OFF");
 }
}

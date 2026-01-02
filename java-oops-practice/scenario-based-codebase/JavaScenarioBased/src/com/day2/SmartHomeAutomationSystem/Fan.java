package com.day2.SmartHomeAutomationSystem;

class Fan extends Appliance{

 Fan(){
     super(40);
 }

 public void turnOn(){
     setPower(true);
     System.out.println("Fan started rotating");
 }

 public void turnOff(){
     setPower(false);
     System.out.println("Fan stopped");
 }
}

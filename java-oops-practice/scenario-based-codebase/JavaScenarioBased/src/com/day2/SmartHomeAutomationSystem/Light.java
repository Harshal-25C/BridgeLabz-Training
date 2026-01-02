package com.day2.SmartHomeAutomationSystem;

//Light device
class Light extends Appliance{

 Light() {
     super(10); // low energy usage
 }

 public void turnOn() {
     setPower(true);
     System.out.println("Light turned ON");
 }

 public void turnOff() {
     setPower(false);
     System.out.println("Light turned OFF");
 }
}

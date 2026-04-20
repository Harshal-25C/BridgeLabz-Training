package com.day2.SmartHomeAutomationSystem;

public class HomeAutomationSystem{
 public static void main(String[] args){

     Appliance light = new Light();
     Appliance fan = new Fan();
     Appliance ac = new AC();

     UserController controller = new UserController();

     //Polymorphic control
     controller.controlDevice(light);
     controller.controlDevice(fan);
     controller.controlDevice(ac);

     //Energy comparison using operators
     if(ac.energyUsage>fan.energyUsage){
         System.out.println("AC consumes more energy than Fan");
     }
 }
}

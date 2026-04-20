package com.day2.SmartHomeAutomationSystem;

//Controller class
class UserController{

 public void controlDevice(Controllable device) {
     device.turnOn(); //Polymorphic call through interface Controllable
 }
}

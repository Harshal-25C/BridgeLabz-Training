package com.day2.SmartHomeAutomationSystem;

abstract class Appliance implements Controllable{
 private boolean power; //encapsulated internal state
 protected int energyUsage;

 Appliance(int energyUsage) {
     this.energyUsage = energyUsage;
 }

 protected void setPower(boolean state) {
     power = state;
 }

 public boolean isOn() {
     return power;
 }
}

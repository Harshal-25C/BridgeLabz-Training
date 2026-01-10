package com.day1.EmergencyPatientNavigation;

class UnitNode {
    String unitName;
    boolean isAvailable;
    UnitNode next;

    UnitNode(String unitName, boolean isAvailable) {
        this.unitName = unitName;
        this.isAvailable = isAvailable;
        this.next = null;
    }
}

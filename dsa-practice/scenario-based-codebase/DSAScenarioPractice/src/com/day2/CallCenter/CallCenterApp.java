package com.day2.CallCenter;

import java.util.*;

public class CallCenterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallCenter center = new CallCenter();

        center.receiveCall(new Customer(101, "Amit", false));
        center.receiveCall(new Customer(102, "Neha", true));
        center.receiveCall(new Customer(103, "Ravi", false));
        center.receiveCall(new Customer(102, "Neha", true));

        center.serveCustomer();
        center.serveCustomer();
        center.serveCustomer();

        center.displayCallStats();
	}

}

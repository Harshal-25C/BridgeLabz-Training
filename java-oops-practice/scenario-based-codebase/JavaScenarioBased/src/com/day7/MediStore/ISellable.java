package com.day7.MediStore;

public interface ISellable {
	void sell(int quantity);
	boolean checkExpiry();
}

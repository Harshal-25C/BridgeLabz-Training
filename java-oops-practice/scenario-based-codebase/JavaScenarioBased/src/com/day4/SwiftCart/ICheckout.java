package com.day4.SwiftCart;

public interface ICheckout {
	void generateBill();
	void applyDiscount(double couponAmount);
}

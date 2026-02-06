package com.demo;

public class BankAccount {
	private double balance;
	private double dailyWithDraw;
	
	private static final double MIN_BALANCE = 5000;
	private static final double DAILY_LIMIT = 10000;
	
	public BankAccount(double balance) {
		this.balance = balance;
		this.dailyWithDraw = 0;
	}
	
	public void withDraw(double amount) {
		if(dailyWithDraw + amount > DAILY_LIMIT) {
			System.out.println("Daily withdrawal limit exceeded");
		}
		
		if(balance-amount < MIN_BALANCE) {
			System.out.println("Minimum balance of 5000 must be maintained");
		}
		
		balance -= amount;
		dailyWithDraw += amount;
		System.out.println("Withdrawal Successful. Remaining bal. "+balance);
	}
	
	public void resetDailyLimit() {
		dailyWithDraw = 0;
	}
	public double getBalance() {
		return balance;
	}
}

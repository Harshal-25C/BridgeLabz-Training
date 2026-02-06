package com.demo;
import java.util.*;

public class BankAccountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount ac = new BankAccount(20000);
		
		ac.withDraw(4000);
		ac.withDraw(7000);
		ac.withDraw(5000);
	}
}

package com.day2.EWalletApplication;

public class User {
 private int userId;
 private String name;
 Wallet wallet;

 User(int userId, String name, Wallet wallet) {
     this.userId = userId;
     this.name = name;
     this.wallet = wallet;
 }

 public String getName() {
     return name;
 }
}

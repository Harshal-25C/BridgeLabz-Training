package com.day2.EWalletApplication;

public class EWalletSystem{
 public static void main(String[] args){

     Wallet pw = new PersonalWallet(3000, true);
     Wallet bw = new BusinessWallet(10000, false);

     //Create users
     User u1 = new User(1, "Amit", pw);
     User u2 = new User(2, "Neha", bw);

     //Polymorphic transfers
     u1.wallet.transferTo(u2, 2000);
     u2.wallet.transferTo(u1, 4000);

     System.out.println("Amit Balance: ₹" + u1.wallet.getBalance());
     System.out.println("Neha Balance: ₹" + u2.wallet.getBalance());
 }
}

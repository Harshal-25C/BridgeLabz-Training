package com.day2.EWalletApplication;

class BusinessWallet extends Wallet{
 BusinessWallet(double amount, boolean referral){
     super(amount, referral);
 }

 @Override
 public void transferTo(User receiver, double amount){
     double tax = amount * 0.02; // 2% tax
     double total = amount + tax;

     if(debit(total)){
         receiver.wallet.credit(amount);
         transactions.add(new Transaction("Business Transfer", amount));
         System.out.println("Transferred ₹" + amount + " with tax ₹" + tax);
     } else {
         System.out.println("Insufficient balance");
     }
 }
}

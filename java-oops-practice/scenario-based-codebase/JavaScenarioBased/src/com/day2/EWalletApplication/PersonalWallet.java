package com.day2.EWalletApplication;

class PersonalWallet extends Wallet{

 PersonalWallet(double amount, boolean referral) {
     super(amount, referral);
 }

 @Override
 public void transferTo(User receiver, double amount) {
     if (amount > 5000) {
         System.out.println("Transfer limit exceeded for Personal Wallet");
         return;
     }
     if (debit(amount)) {
         receiver.wallet.credit(amount);
         transactions.add(new Transaction("Personal Transfer", amount));
         System.out.println("Transferred ₹" + amount + " to " + receiver.getName());
     } else {
         System.out.println("Insufficient balance");
     }
 }
}

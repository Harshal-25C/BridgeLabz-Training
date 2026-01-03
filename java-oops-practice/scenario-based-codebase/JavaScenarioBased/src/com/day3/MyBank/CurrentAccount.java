package com.day3.MyBank;

class CurrentAccount extends Account{

 CurrentAccount(String accNo){
     super(accNo);
 }

 //No interest for current account
 double calculateInterest(){
     return 0;
 }
}


package com.day1;

//CurrentAccount inherits Account with different behavior
class CurrentAccount3 extends Account3 {

 public CurrentAccount3(int accNo, double balance) {
     super(accNo, balance);
 }
//Overridden display method (polymorphism)
 public void display() {
     System.out.println("Current Account");
     super.display();
 }
}



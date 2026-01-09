package com.day8.DigitalArtMarketplace;

class User {
    private String name;
    private double walletBalance;

    public User(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    public double getWalletBalance(){
        return walletBalance;
    }

    public void deductAmount(double amount) {
        if(walletBalance >= amount){
            walletBalance-=amount;   //Operator usage
        }else{
            throw new RuntimeException("Insufficient wallet balance");
        }
    }

    public String getName(){
        return name;
    }
}

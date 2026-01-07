package com.day6.BookBazaar;

public class EBook extends Book{
    public EBook(String title, String author, double price, int stock){
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(int quantity) {
        //Flat 20% discount on EBooks
        return price*quantity*0.20;
    }
}

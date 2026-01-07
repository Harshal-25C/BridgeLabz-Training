package com.day6.BookBazaar;

public class PrintedBook extends Book{
    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(int quantity) {
        //Buy 3 get 10% off
        if(quantity>=3){
            return price*quantity*0.10;
        }
        return 0;
    }
}

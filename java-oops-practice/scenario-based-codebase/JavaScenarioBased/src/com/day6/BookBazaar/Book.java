package com.day6.BookBazaar;

public abstract class Book implements IDiscountable{
    protected String title;
    protected String author;
    protected double price;

    private int stock;//encapsulated

    public Book(String title, String author, double price, int stock){
        this.title=title;
        this.author=author;
        this.price =price;
        this.stock= stock;
    }

    //Encapsulation: stock update via method only
    public boolean reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public abstract double applyDiscount(int quantity);
}

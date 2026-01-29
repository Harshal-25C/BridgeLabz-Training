package com.forEachMethod;

import java.util.*;

public class StockPriceLogger {

    public static void main(String[] args) {

        List<Double> stockPrices = Arrays.asList(
                1523.45, 1530.10, 1518.75, 1542.30
        );

        stockPrices.forEach(price ->
                System.out.println("Stock Price Update: ₹" + price)
        );
    }
}

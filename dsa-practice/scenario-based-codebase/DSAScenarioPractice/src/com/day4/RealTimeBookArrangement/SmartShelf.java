package com.day4.RealTimeBookArrangement;

import java.util.List;

public class SmartShelf {
    public static void insertionSort(List<Book> books) {

        for(int i=1; i<books.size(); i++) {
        	
            Book key = books.get(i);
            int j = i-1;

            //Shift larger titles forward
            while(j>=0 && books.get(j).getTitle().compareToIgnoreCase(key.getTitle()) > 0) {

                books.set(j+1, books.get(j));
                j--;
            }

            books.set(j+1, key);
        }
    }
}

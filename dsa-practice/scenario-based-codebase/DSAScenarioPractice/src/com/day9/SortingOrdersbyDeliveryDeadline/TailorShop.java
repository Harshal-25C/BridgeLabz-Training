package com.day9.SortingOrdersbyDeliveryDeadline;

public class TailorShop {
	// Initialize Insertion Sort
	public static void InsertionSort(Order arr[]){
        int n = arr.length;

        for(int i=0; i<n; i++){
            Order curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev].deliveryDay > curr.deliveryDay){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr; 
        }
    }
	
	public static void main(String[] args) {
		Order[] arr = {
				new Order(101, "Harshal", 7),
				new Order(102, "Ayush", 5),
				new Order(103, "Devarshi", 3),
				new Order(104, "Harry", 1),
				new Order(104, "Ron", 2),
				new Order(104, "Draco", 4),
		};
		
		InsertionSort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}

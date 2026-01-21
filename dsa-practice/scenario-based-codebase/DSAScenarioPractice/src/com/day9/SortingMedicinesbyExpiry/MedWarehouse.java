package com.day9.SortingMedicinesbyExpiry;

public class MedWarehouse {
	public static void mergeSort(Medicine[] arr, int start, int end) {
		if(start < end) {
			int mid = start+(end-start)/2;
			
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
	}
	
	public static void merge(Medicine[] arr, int start, int mid, int end) {
		int[] merged = new int[end-start+1];
		
		int idx1 = start;
		int idx2 = mid+1;
		int x = 0;
		
		while(idx1 <= mid && idx2 <= end) {
			if(arr[idx1].expiryDate <= arr[idx2].expiryDate) {
				merged[x++]=arr[idx1++].expiryDate;
			}else {
				merged[x++]=arr[idx2++].expiryDate;
			}
		}
		
		while(idx1 <= mid) {
			merged[x++] = arr[idx1++].expiryDate;
		}
		while(idx2 <= end) {
			merged[x++] = arr[idx2++].expiryDate;
		}
		
		for(int i=0, j=start; i<merged.length; i++, j++) {
			arr[j].expiryDate = merged[i];
		}
	}
	public static void main(String[] args) {
		Medicine[] arr = {
				new Medicine("Peracetamol", 23),
				new Medicine("Cetirizine", 24),
				new Medicine("Amoxicillin", 28),
				new Medicine("Dolex", 25),
		};
		
		mergeSort(arr, 0, arr.length-1);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
	}
}

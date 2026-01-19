package com.day7.RankSheetGenerator;
import java.util.*;

public class EduResultsApp {
	public static void mergeSort(Student[] student, int start, int end) {
		if(start < end) {
			int mid = start+(end-start)/2;
			mergeSort(student, start, mid);
			mergeSort(student, mid+1, end);
			merge(student, start, mid, end);
		}
	}
	
	public static void merge(Student[] student, int start, int mid, int end) {
		Student merged[] = new Student[end-start+1];
		
		int idx1 = start;
		int idx2 = mid+1;
		int x=0;
		
		while(idx1 <= mid && idx2 <= end) {
			if(student[idx1].marks <= student[idx2].marks) {
				merged[x++] = student[idx1++];
			}else {
				merged[x++] = student[idx2++];
			}
		}
		
		while(idx1 <= mid) {
			merged[x++] = student[idx1++];
		}
		while(idx2 <= end) {
			merged[x++] = student[idx2++];
		}
		
		for(int i=0, j=start; i<merged.length; i++, j++) {
			student[j] = merged[i];
		}
	}
	public static void main(String[] args) {
		Student[] student = {
				new Student(01, "Ayush", 94),
				new Student(03, "Harshal", 99),
				new Student(02, "Devarshi", 98),
				new Student(15, "John", 95),
				new Student(12, "Ron", 70),
		};
		
		mergeSort(student, 0, student.length-1);
		for(Student v : student) {
            System.out.println(v);
        }
	}
}

package com.day7.RankSheetGenerator;

public class Student {
	int id;
	String name;
	int marks;
	
	Student(int id, String name, int marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public String toString() {
		return "StuId: "+id + ", Name: "+name+ ", Marks: "+marks+"\n";
	}
}

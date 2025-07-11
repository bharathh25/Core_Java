package com.day6.bharath;

class Student{
	String name;
	int[] marks = new int[5];
	
	Student(String name,int[] marks){
		this.name=name;
		this.marks=marks;
	}
	
	void displayAverage(){
		int sum =0;
		for(int m : marks) {
			sum = sum +m;
		}
		
		int avg = sum/marks.length+1;
		System.out.println("The average marks scored by "+name+" is "+avg+".");
		
	}
}
public class StudentMarksSystem {
	public static void main(String[] args) {
		Student[] s = new Student[2];
		s[0]= new Student("Virat",new int[]{90,92,93,99,96});
		s[1]= new Student("Rohit",new int[]{67,78,63,49,56});
		
		for(Student n : s) {
			n.displayAverage();
		}
	}
}

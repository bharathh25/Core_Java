package com.day1.bharath;
/*
 
 class Student {
    String name;
    int age;

    // Task: Create both default and parameterized constructors
    // and print details in both cases
}

 */

class Student {
    String name;
    int age;

    Student(){
    	System.out.println("Default/ No-Parameter Constructor");
    }
    
    Student(int age){
        this.age = age;
    	System.out.println("1 parameter constructor having age : "+this.age);
    }
    
    Student(String name){
    	this.name = name;
    	System.out.println("1 parameter constructor having name : "+this.name);
    }
    
    Student(String name,int age){
    	this.name = name;
        this.age = age;
    	System.out.println("2 Parameter constructor having data "+this.name+" and "+this.age);
    }
}
public class ConstructorPractice {
	public static void main(String[] args) {
		 new Student();
		 new Student(23);
		 new Student("Bharath");
		 new Student("Virat",36);
		 
		 /*
		  Student s = new Student();
		Student s1 = new Student(23);
		Student s2 = new Student("Bharath");
		Student s3 = new Student("Virat",36); we can write like this also, as we arent using ref var , we can write like the above code
		  */
		
	}
}

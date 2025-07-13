package com.day1.bharath;
/*
 
 class Car {
    String brand;
    int year;

    void displayDetails() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
    
        // Task: Create 2 objects with different values and call displayDetails()
    }
}

 
 
 */

class Car {
    String brand;
    int year;

    void displayDetails() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
public class ClassAndObject {
	public static void main(String[] args) {
		Car c1 =  new Car();
		c1.brand="BMW";
		c1.year=1999;
		c1.displayDetails();
		
		Car c2 = new Car();
		c2.brand="Audi";
		c2.year=1980;
		c2.displayDetails();
	}
}

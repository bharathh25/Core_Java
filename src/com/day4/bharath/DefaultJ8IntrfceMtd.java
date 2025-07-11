package com.day4.bharath;

/*
 * interface Vehicle {
    void start();

    default void fuelType() {
        System.out.println("Petrol/Diesel");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starting...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Bike object
        // Call both start() and fuelType()
    }
}

 */

interface Vehicle{
	void start();
	
	default void fuelType(){
		System.out.println("Petrol/Diesel");
	}
}

class Bike implements Vehicle{
	public void start() {
		System.out.println("Bike starting...");
	}
}
public class DefaultJ8IntrfceMtd {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.fuelType();
		b.start();
	}
}

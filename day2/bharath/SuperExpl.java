package com.day2.bharath;

/*
 * class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor");
    }
}

class Car extends Vehicle {
    Car() {
        super(); // Explicitly calling parent constructor
        System.out.println("Car constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create object of Car and observe constructor chaining
    }
}

 */

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor");
    }
}

class Car extends Vehicle {
    Car() {
        super(); // Explicitly calling parent constructor
        System.out.println("Car constructor");
    }
}


public class SuperExpl {
	public static void main(String[] args) {
		new Car();
		
	}
}



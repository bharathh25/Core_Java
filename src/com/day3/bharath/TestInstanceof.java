package com.day3.bharath;

/*
 * class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class TestInstanceof {
    public static void main(String[] args) {
        Animal a = new Dog();

        // Use instanceof to check type of a
        // Print appropriate message
    }
}

 */

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class TestInstanceof {
    public static void main(String[] args) {
        Animal a = new Dog();

        // Use instanceof to check type of a
        // Print appropriate message
        
        if(a instanceof Dog) {
        	System.out.println("a is an instance of Dog");
        }
        else {
        	System.out.println("a is not an instance of Dog");
        }
    }
}

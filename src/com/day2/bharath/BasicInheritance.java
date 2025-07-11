package com.day2.bharath;


/*
 class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create object of Dog
        // Call both eat() and bark()
    }
}
 */

class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class BasicInheritance {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();
		
	}

}

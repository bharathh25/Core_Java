package com.day4.bharath;

/*
 * abstract class Shape {
    abstract void area();

    void description() {
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape {
    int length = 5, breadth = 3;

    void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

public class Main {
    public static void main(String[] args) {
        // Create object of Rectangle
        // Call both area() and description()
    }
}

 */

abstract class Shape {
    abstract void area();

    void description() {
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape {
    int length = 5, breadth = 3;

    void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

public class AbsrtClsImpl {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.description();
		r.area();
	}
}

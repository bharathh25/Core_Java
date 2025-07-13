package com.day3.bharath;
/*
 * class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.draw(); // Output?

        s = new Square();
        s.draw(); // Output?
    }
}

 */

class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
}

public class MethodOverridingAndDynamicDispatch {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.draw(); // Output?

        s = new Square();
        s.draw(); // Output?
    }
}



package com.day9.bharath;

public class TypeConversion {
    public static void main(String[] args) {
        int a = 10;
        double b = a; // widening

        double x = 9.87;
        int y = (int)x; // narrowing

        // Task:
        // Print all values and explain in comments
        System.out.println(b);
        System.out.println(y);
    }
}


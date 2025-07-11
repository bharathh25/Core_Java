package com.day8.bharath;

/*
 * public class Divide {
    public static void main(String[] args) {
        int a = 10, b = 0;

        // Task:
        // 1. Try dividing a by b
        // 2. Catch ArithmeticException and print custom message
    }
}

 */
public class Divide {
    public static void main(String[] args) {
        int a = 10, b = 0;

        try {
        	int c = a/b;
        	System.out.println(c);
        }
        catch(ArithmeticException e) {
        	System.out.println("Invalid Division");
        }

    }
}
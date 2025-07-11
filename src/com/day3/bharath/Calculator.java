package com.day3.bharath;
/*
 *class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Create object and call all add() methods
    }
}

 */
public class Calculator {
	static int add(int a, int b) {
        return a + b;
    }

	static double add(double a, double b) {
        return a + b;
    }

	static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Create object and call all add() methods
    	int a = add(8,10);
    	double b =add(12.5,34.5);
    	int c = add(1,2,3);
    	
    	System.out.println("The outputs are :"+a+ ","+b+","+c);
    }

}

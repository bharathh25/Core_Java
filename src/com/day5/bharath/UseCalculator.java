package com.day5.bharath;
import com.day4.bharath.Calculator;


public class UseCalculator {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("Sum : "+c.add(2,3));
		System.out.println("Multiplication : "+c.multiply(3, 2));
	}
}

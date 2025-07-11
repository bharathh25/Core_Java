package com.day9.bharath;

/*
 *  Mini Task – Real-world Application: Billing System
--Input a price as a String (e.g. "399.99")

--Convert it to double using Double.parseDouble()

--Calculate and print final price after 18% GST
 */

public class Billing_System {
	public static void main(String[] args) {
		String Base_Price="399.99";
		
		double a = Double.parseDouble(Base_Price);
		
		double GST = (18*a)/100;
		
		double total_price = a+GST;
		
		System.out.println("Base Price : "+a);
		System.out.println("GST 18% : "+GST);
		System.out.println("Total Price : "+total_price);
	}
}

package com.day1.bharath;

/*
 
 class Product {
    String name;
    double price;

    // Task: Use 'this' keyword to resolve variable shadowing
    // in constructor
}

 */

class Product {
    String name;
    double price;

    Product(String name,double price){
    	this.name=name;
    	this.price=price;
    	System.out.println("this keyword is used to resolve overshadowing of local variable over instance variable.The data here is : "+this.name+" and "+this.price);
    }
}

public class ThisKeyword {
		public static void main(String[] args) {
			new Product("Rohit",45.45);
		}
}

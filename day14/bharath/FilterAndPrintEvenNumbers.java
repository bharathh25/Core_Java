package com.day14.bharath;
import java.util.*;
/*
 *  Mini Task – Filter & Print Even Numbers
Use lambda with forEach to:

Print only even numbers from a list

Multiply them by 2 before printing

java
Copy
Edit
List<Integer> nums = Arrays.asList(5, 10, 15, 20, 25, 30);
Optional: Try using Stream with .filter() and .map() if you're curious
 */
public class FilterAndPrintEvenNumbers {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(5, 10, 15, 20, 25, 30);
		
		nums.forEach( a ->{
			if(a%2==0) {
				System.out.println(a*a);
			}
		}	
		);
			
		
	}

}

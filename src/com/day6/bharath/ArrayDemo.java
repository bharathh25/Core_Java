package com.day6.bharath;


/*
 * public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Task:
        // 1. Print all elements using for-each loop
        // 2. Find and print the sum of all elements
    }
}

 */
public class ArrayDemo {
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50};
		
		for(int n : numbers) {
			System.out.println(n);
		}
		
		int sum =0;
		for(int s : numbers) {
			sum = sum+s;
		}
		System.out.println("The sum of elements in array : "+sum);
	}

}

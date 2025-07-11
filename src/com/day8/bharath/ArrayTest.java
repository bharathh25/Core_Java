package com.day8.bharath;

/*
 * public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        // Task:
        // 1. Access 5th element using index 4
        // 2. Catch ArrayIndexOutOfBoundsException and handle it
    }
}

 */

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        try {
        	int a = arr[4];
        	System.out.println(a);
        }
        catch(ArrayIndexOutOfBoundsException e){
        	System.out.println("Invalid access to array element");
        }
    }
}
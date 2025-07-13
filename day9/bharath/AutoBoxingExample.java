package com.day9.bharath;

/*
 * public class AutoBoxingExample {
    public static void main(String[] args) {
        // Task:
        // 1. Assign primitive int to Integer object (autoboxing)
        // 2. Assign Integer object back to primitive int (unboxing)
        // 3. Use in simple addition operation
    }
}

 */
public class AutoBoxingExample {
    public static void main(String[] args) {
        // 1. Assign primitive int to Integer object (Autoboxing)
        int num = 10;
        Integer obj = num; // autoboxing

        // 2. Assign Integer object back to primitive int (Unboxing)
        int newNum = obj; // unboxing

        // 3. Use in simple addition operation
        int sum = newNum + 5;

        // Output the results
        System.out.println("Original int: " + num);
        System.out.println("Autoboxed Integer: " + obj);
        System.out.println("Unboxed int: " + newNum);
        System.out.println("After addition: " + sum);
    }
}



package com.day13.bharath;
/*
 * import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        // Task:
        // 1. Add numbers: 10, 20, 30, 10, 20
        // 2. Print all elements
        // 3. Check if 20 is present
    }
}

 */
import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        
        for(int i : numbers) {
        	System.out.println(i);
        }
        
        System.out.println("-------------");
        
        if(numbers.contains(20)) {
        	System.out.println("20 is present");
        }
        else {
        	System.out.println("20 is not present");
        }
    }
}


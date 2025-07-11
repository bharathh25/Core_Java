package com.day13.bharath;
/*
 * import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // Task:
        // 1. Add 5 fruits to the list
        // 2. Remove one fruit
        // 3. Print all fruits using for-each loop
        // 4. Print the fruit at index 2
    }
}

 */
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("DragonFruit");
        fruits.add("Watermelon");
        
        for(String s : fruits) {
        	System.out.println(s);
        }
        System.out.println("----------------");
        fruits.remove(1);
        for(String s : fruits) {
        	System.out.println(s);
        }
        System.out.println("----------------");
        System.out.println(fruits.get(2));
        
        System.out.println("----------------");
    }
}


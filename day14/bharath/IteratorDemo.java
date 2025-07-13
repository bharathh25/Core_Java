package com.day14.bharath;
/*
 * import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Task:
        // 1. Get an Iterator for the list
        // 2. Print all elements using while-loop and iterator
    }
}

 */
import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
       
        //1
        Iterator<String> a = names.iterator();
        //2
        while(a.hasNext()) {
        	System.out.println(a.next());
        }
        
    }
}

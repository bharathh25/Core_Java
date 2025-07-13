package com.day14.bharath;
/*
 * import java.util.*;

public class SortLambda {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Mumbai", "Chennai", "Delhi", "Bangalore");

        // Task:
        // 1. Sort cities by length using lambda & Comparator
        // 2. Print sorted list
    }
}

 */
import java.util.*;

public class SortLambda {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Mumbai", "Chennai", "Delhi", "Bangalore");
        
        cities.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
        
        System.out.println("Sorted List : ");
        for(String s : cities) {
        	System.out.println(s);
        }
    }
}

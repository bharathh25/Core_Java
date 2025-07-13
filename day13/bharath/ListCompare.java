package com.day13.bharath;

/*
 * import java.util.*;

public class ListCompare {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // Task:
        // 1. Add 3 elements to each
        // 2. Print elements of both
        // 3. Add element at index 1 in linked list
    }
}

 */
import java.util.*;

public class ListCompare {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        
        linkedList.add("Four");
        linkedList.add("Five");
        linkedList.add("Six");
        
        for(String s1 : arrayList) {
        	System.out.println(s1);
        }
        
        System.out.println("-------------");
        
        for(String s2 : linkedList) {
        	System.out.println(s2);
        }
        
        System.out.println("-------------");
        
        
        linkedList.add(1, "New");
        
        System.out.println("-------------");
        
        for(String s2 : linkedList) {
        	System.out.println(s2);
        }
    }
}


package com.day13.bharath;
/*
 * import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        // Task:
        // 1. Add roll no and name for 3 students
        // 2. Retrieve and print name using a roll number
        // 3. Iterate through all keys and values
    }
}

 */
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        	
        students.put(2, "Virat");
        students.put(3, "ABD");
        students.put(1, "Gayle");
        
        System.out.println(students.get(3));
        System.out.println("--------------------");
        
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}


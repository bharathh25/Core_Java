package com.day7.bharath;
/*
 * public class CompareStrings {
    public static void main(String[] args) {
        String a = "Java";
        String b = new String("Java");
        String c = "Java";

        // Task:
        // 1. Compare using == and equals()
        // 2. Explain output in comments
    }
}

 */

public class StringComparision {
    public static void main(String[] args) {
        String a = "Java";
        String b = new String("Java");
        String c = "Java";

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(c==b);
        
    }
}


package com.day7.bharath;

/*
 * public class BuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // Task:
        // 1. Append " World"
        // 2. Insert " Java" after "Hello"
        // 3. Replace "Hello" with "Hi"
        // 4. Reverse the string and print
    }
}

 */

public class BuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb.append(" World"));
        System.out.println(sb.insert(6, "Java "));
        System.out.println(sb.replace(0, 5, "Hi"));
       // System.out.println(sb.reverse());
        System.out.println(sb.reverse().toString());
        
    }
}

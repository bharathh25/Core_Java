package com.day9.bharath;
/*
 * public class WrapperDemo {
    public static void main(String[] args) {
        int a = 20;

        // Task:
        // 1. Manually convert primitive to Integer object (boxing)
        // 2. Manually extract int value from Integer object (unboxing)
        // 3. Print both
    }
}

 */


public class WrapperDemo {
    public static void main(String[] args) {
        int a = 20;

        Integer b = a;
        System.out.println(b);
        
        int c = 18;
        Integer obj = Integer.valueOf(c);
        System.out.println(obj);
    }
}

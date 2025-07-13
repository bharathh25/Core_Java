package com.day14.bharath;
/*
import java.util.*;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 40);

        // Task:
        // 1. Use forEach and lambda to print each number
        // 2. Print square of each number using lambda
    }
}

*/

import java.util.*;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 40);

        nums.forEach(a -> System.out.println(a));
        
        System.out.println("----------------");
        
        nums.forEach(b -> System.out.println("Square of "+b+" : "+b*b));
    }
}

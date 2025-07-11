package com.day9.bharath;

/*
 * public class WrapperMethods {
    public static void main(String[] args) {
        String num = "123";
        String price = "99.99";
        char ch = '9';

        // Task:
        // 1. Convert num to int using Integer.parseInt
        // 2. Convert price to double using Double.parseDouble
        // 3. Use Character.isDigit and Character.isLetter on ch
        // 4. Print results
    }
}
 */

public class WrapperMethods {
    public static void main(String[] args) {
        String num = "123";
        String price = "99.99";
        char ch = '9';

        int a = Integer.parseInt(num);
        double b = Double.parseDouble(price);
        boolean isDigit = Character.isDigit(ch);
        boolean isLetter = Character.isLetter(ch);

        // 4. Print results
        System.out.println("Converted int: " + a);
        System.out.println("Converted double: " + b);
        System.out.println("Is '" + ch + "' a digit? " + isDigit);
        System.out.println("Is '" + ch + "' a letter? " + isLetter);
    }
}


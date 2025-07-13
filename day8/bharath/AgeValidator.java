package com.day8.bharath;

/*
 * public class AgeValidator {
    static void checkAge(int age) throws Exception {
        if (age < 18)
            throw new Exception("Not eligible to vote");
        else
            System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        // Task:
        // 1. Call checkAge with age = 16
        // 2. Catch the exception and print the message
    }
}

 */


public class AgeValidator {
    static void checkAge(int age) throws Exception {
        if (age < 18)
            throw new Exception("Not eligible to vote");
        else
            System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        try {
        	//checkAge(9);
        	checkAge(29);
        }
        catch(Exception e) {
        	System.out.println("Exception occurred : "+e.getMessage());
        }
    }
}


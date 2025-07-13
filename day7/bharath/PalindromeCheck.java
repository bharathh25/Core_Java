package com.day7.bharath;

/*
 * public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";

        // Task:
        // 1. Check if the string is a palindrome (same forwards and backwards)
        // 2. Use both charAt() and reverse() approach with StringBuilder
    }
}

 */

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";

        StringBuilder str2 = new StringBuilder(str);
       
        if(str.equals(str2.reverse().toString())) {
        	System.out.println("Its a palindrome");
        }
        else {
        	System.out.println("Its not a palindrome");
        }
        
        System.out.println("str2.charAt(3) : "+str2.charAt(3));
        System.out.println("Reversed String : "+str2.reverse());
        
    }
}

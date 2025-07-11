package com.day7.bharath;
/*
 * public class StringBasics {
    public static void main(String[] args) {
        String s = "  Java Programming  ";

        // Task:
        // 1. Trim leading/trailing spaces
        // 2. Convert to uppercase
        // 3. Replace "Java" with "Core Java"
        // 4. Print substring from index 5 to 15
    }
}

 */
public class StringBasics {
    public static void main(String[] args) {
        String s = "  Java Programming  ";
        System.out.println(s);
        
        String s1=s.trim();
        System.out.println("Trim leading/trailing spaces : "+s1);
        
        String s2=s.toUpperCase();
        System.out.println("Convert to uppercase : "+s2);
        
        String s3=s.replace("Java", "Core Java");
        System.out.println("Replace 'Java' with 'Core Java' : "+s3);
        
        String s4=s.substring(5,16);
        System.out.println("Print substring from index 5 to 15 : "+s4);
       
    }
}

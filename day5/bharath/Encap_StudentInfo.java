package com.day5.bharath;

/*
 * class Student {
    private String name;
    private int age;

    // Create public getter & setter for both fields

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create student object
        // Set values using setters
        // Call display() and getters
    }
}

 */

class Student {
    private String name;
    private int age;

    // Create public getter & setter for both fields
    public void setName(String name) {
    	this.name=name;
    }
    
    public String getName(){
    	return name;
    }

    public void setAge(int age) {
    	this.age=age;
    }
    
    public int getAge(){
    	return age;
    }
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Encap_StudentInfo {
    public static void main(String[] args) {
        // Create student object
        // Set values using setters
        // Call display() and getters
    	Student s = new Student();
    	s.setName("Bharath");
    	s.setAge(23);
    	
    	s.display();
    	
    	String n = s.getName();
    	int a = s.getAge();
    	System.out.println("Name : "+n+", Age : "+a);
    }
}



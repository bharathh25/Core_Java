package com.day10.bharath;

/*
 * class Student {
    int id;
    String name;
    static String school = "ABC School";

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name + " " + school);
    }
}

public class Main {
    public static void main(String[] args) {
        // Task:
        // 1. Create two Student objects with different names/IDs
        // 2. Display both (observe how 'school' remains the same)
    }
}

 */

class Student {
    int id;
    String name;
    static String school = "ABC School";

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name + " " + school);
    }
}

public class StaticVarSharing {
    public static void main(String[] args) {
       
    	Student s = new Student(18,"Virat");
    	s.display();
    	Student s1 = new Student(45,"Rohit");
    	s1.display();
    	
    }
}



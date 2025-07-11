package com.day11.bharath;

/*
 * final class Student {
    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Add only getters
    ///
    ///public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student(101, "Alice");

        // Task:
        // 1. Print name and ID
        // 2. Try modifying (shouldn’t be possible)
    }
}

}

 */

final class Student {
    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Add only getters
    public int getID() {
    	return id;
    }
    
    public String getName() {
    	return name;
    }
}

public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student(101, "Alice");
		System.out.println(s.getName());
		System.out.println(s.getID());
		
		//s.getID()=12;
	}

}

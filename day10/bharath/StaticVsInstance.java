package com.day10.bharath;

/*
 * class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println("Object created. Count = " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        // Task:
        // 1. Create 3 objects of Counter
        // 2. Observe how static count keeps increasing
    }
}

 */
class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println("Object created. Count = " + count);
    }
}
public class StaticVsInstance {
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
	}
}

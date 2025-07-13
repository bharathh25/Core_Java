package com.day10.bharath;

/*
 * class MathUtils {
    static int square(int x) {
        return x * x;
    }

    static int cube(int x) {
        return x * x * x;
    }
}

public class Main {
    public static void main(String[] args) {
        // Task:
        // 1. Call square() and cube() directly using class name
        // 2. Print results for any number
    }
}

 */
class MathUtils {
    static int square(int x) {
        return x * x;
    }

    static int cube(int x) {
        return x * x * x;
    }
}

public class Calc {
	public static void main(String[] args) {
		System.out.println(MathUtils.square(25));
		System.out.println(MathUtils.cube(3));
	}

}

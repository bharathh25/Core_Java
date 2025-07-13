package com.day14.bharath;
/*
 * @FunctionalInterface
interface Greeting {
    void sayHello();
}

public class LambdaDemo {
    public static void main(String[] args) {
        // Task:
        // 1. Use lambda to implement sayHello()
        // 2. Print "Hello, Java!"
    }
}

 */
@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class LambdaDemo {
    public static void main(String[] args) {
        Greeting a = () -> System.out.println("Hello, Java!");
        
        a.sayHello();
    }
}


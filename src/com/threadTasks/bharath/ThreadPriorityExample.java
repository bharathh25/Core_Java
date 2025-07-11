package com.threadTasks.bharath;

class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name); // Set thread name via constructor
    }

    public void run() {
        // Print thread name and priority
        System.out.println("Running thread: " + getName() + ", Priority: " + getPriority());
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        // Create two threads
        PriorityThread t1 = new PriorityThread("HighPriorityThread");
        PriorityThread t2 = new PriorityThread("LowPriorityThread");

        // Set priorities
        t1.setPriority(Thread.MAX_PRIORITY); // 10
        t2.setPriority(Thread.MIN_PRIORITY); // 1

        // Start threads
        t1.start();
        t2.start();
    }
}

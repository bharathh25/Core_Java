package com.threadTasks.bharath;

class DownloadThread extends Thread {
    public void run() {
        // Print the name of the current thread
        System.out.println("Running thread: " + Thread.currentThread().getName());
    }
}

public class ThreadNameExample {
    public static void main(String[] args) {
        DownloadThread t1 = new DownloadThread();
        t1.setName("Downloader-1");  // Set thread name
        t1.start();  // Start the thread
    }
}

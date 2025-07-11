package com.threadTasks.bharath;
/*
 *  Task 3: Use isAlive()
Create a thread that prints "Working..." and sleeps for 3 seconds. In main thread:

Start the thread

Immediately check if it's alive

Wait 4 seconds

Check again
 */

class Task3 extends Thread{
	public void run() {
		System.out.println("Run Method");
	}
}
public class AliveExmpl {
	public static void main(String[] args) {
		Task3 t = new Task3();
		t.start();
		System.out.println(t.isAlive());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t.isAlive());
	}

}

package com.threadTasks.bharath;
/*
 * Create a thread that prints numbers 1 to 5 with a 1-second delay between each print.

🔧 Requirements:
Create a class extending Thread

Use start() to run it

Use sleep(1000) between numbers
 */

class Task1 extends Thread{
	public void run() {
		System.out.println("Run Method");
	}
}
public class StartSleep {
	public static void main(String[] args) {
		Task1 t = new Task1();
		
		t.start();
		try {
			for(int i =1;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
		}
			}
			catch(InterruptedException e) {
				System.out.println("Exception Occurred !!!");
			}
	}

}

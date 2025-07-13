package com.threadTasks.bharath;
/*
 * Task 2: Use join()
Create two threads:

Thread 1 prints "A" 5 times

Thread 2 prints "B" 5 times, but only after Thread 1 finishes

🔧 Hint:
Use join() on thread1 before starting thread2.
 */

class Task2 extends Thread{
	public void run() {
		System.out.println("Run Method");
	}
}
public class JoinExmpl {
	public static void main(String[] args) {
		Task2 t = new Task2();
		Task2 t1 = new Task2();
		
		t.start();
		for(int i =0;i<=4;i++) {
			System.out.println("A");
		}
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t1.start();
		for(int i =0;i<=4;i++) {
			System.out.println("B");
		}
		
		
	}

}

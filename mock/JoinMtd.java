package in.papers.mock;
//Join Method

class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<6;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread2 extends Thread{
	public void run() {
		for(int i=10;i<16;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class JoinMtd {
	
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		t1.start();
		
		try {
			t1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
	}

}

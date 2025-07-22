package in.test;
//Join method

class Thread1 extends Thread{
	public void run() {
		for(int i=0;i<6;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Q9 {
	public static void main(String[] args) {
		Thread1 t = new Thread1();
		Thread1 t1 = new Thread1();
		t.start();
		try {
			t.join();
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		t1.start();
	}

}

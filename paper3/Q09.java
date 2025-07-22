package in.paper3;
//Join in threads

class OneThread extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(getName()+": "+i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
public class Q09 {
	public static void main(String[] args) {
		OneThread t1 = new OneThread();
		OneThread t2 = new OneThread();
		t1.start();
		try {
			t1.join();
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		t2.start();
		
	}

}

package in.test2;
//Synchronized
class Table{
	synchronized void count(int a ) {
		for(int i =1;i<11;i++) {
			System.out.println(a+" x "+i+" = "+a*i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
class MyThread1 extends Thread{
	Table t;
	
	MyThread1(Table t){
		this.t = t;
	}
	
	public void run() {
		t.count(5);
	}
}

class MyThread2 extends Thread{
	Table t;
	
	MyThread2(Table t){
		this.t=t;
	}
	
	public void run() {
		t.count(25);
	}
}
public class Q05 {
	public static void main(String[] args) {
		Table tab = new Table();
		
		MyThread1 t1 = new MyThread1(tab);
		MyThread2 t2 = new MyThread2(tab);
		
		t1.start();
		t2.start();
		
		
	}

}

package in.test2;
//Multiple Inheritance

interface A{
	void show();
}

interface B{
	void display();
}

class C1 implements A,B{
	public void show() {
		System.out.println("C-A");
	}
	
	public void display() {
		System.out.println("B-A");
	}
}
public class Q06 {

	public static void main(String[] args) {
		C1 c = new C1();
		c.show();
		c.display();
	}
}

package in.test;
//Dynamic Polymorphism or Method Overriding

class A1 {
	void display() {
		System.out.println("A");
	}
}

class B1 extends A1{
	void display() {
		System.out.println("B");
	}
}

class C1 extends A1{
	void display() {
		System.out.println("C");
	}
}
public class Q10 {
	
	public static void main(String[] args) {
		B1 b = new B1();
		b.display();
		
		C1 c = new C1();
		c.display();
	}

}

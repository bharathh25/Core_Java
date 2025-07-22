package in.test;
//Hierarchical Inheritance

class A{
	void see() {
		System.out.println("A");
	}
}

class B extends A{
	void show() {
		System.out.println("B");
	}
}

class C extends A{
	void display() {
		System.out.println("C");
	}
}
public class Q4 {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		
		b.see();
		b.show();
		
		c.see();
		c.display();
	}

}

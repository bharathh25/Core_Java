package in.papers.mock;
//Hierarchical Inheritance

class A{
	void see() {
		System.out.println("A");
	}
}

class B extends A{
	void seen() {
		System.out.println("B");
	}
}

class C extends A{
	void saw() {
		System.out.println("C");
	}
}

public class HierInHerit {
	public static void main(String[] args) {
		B b = new B();
		b.see();
		b.seen();
		
		C c = new C();
		c.see();
		c.saw();
	}

}

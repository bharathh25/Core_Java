package in.paper3;
//Hierarchical Inheritance

class A{
	void name() {
		System.out.println("A");
	}
}

class B extends A{
	void name1() {
		System.out.println("B");
	}
}

class C extends A{
	void name2() {
		System.out.println("C");
	}
}

public class Q04 {
	public static void main(String[] args) {
		B b = new B();
		b.name();
		b.name1();
		
		C c = new C();
		c.name();
		c.name2();
	}

}

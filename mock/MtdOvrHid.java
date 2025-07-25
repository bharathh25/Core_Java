package in.papers.mock;
//Method Overloading and Method Hiding

class Sum{
	int add(int a , int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	double add(double a, double b) {
		return a+b;
	}
}

class Parent1{
	static void show() {
		System.out.println("Parent class");
	}
	
	void see1() {
		System.out.println("P");
	}
}

class Child1 extends Parent1{
	static void show() {
		System.out.println("Child class");
	}
	
	void see2() {
		System.out.println("C");
	}
}
public class MtdOvrHid {
	
	public static void main(String[] args) {
		
		Sum s = new Sum();
		
		int a1 = s.add(2, 3);
		int a2 = s.add(1, 2, 3);
		double a3 = s.add(3.3, 3.6);
		
		System.out.println(a1+" "+a2+" "+a3);
		
		System.out.println("------------------------------------------");
		
		Parent1 p = new Parent1();
		Parent1.show();	//Parent Class
		p.see1();	//P
		System.out.println("------------------------------------------");
		
		Child1 c = new Child1();
		c.see1();  //P
		c.see2();  //C
		Child1.show(); //Child class
		System.out.println("------------------------------------------");
		
		Parent1 p1 = new Child1(); //Upcasting
		p1.see1(); //P
		Parent1.show(); //Parent Class.....Method Hiding
		System.out.println("------------------------------------------");
		
//		Child1 c1 = (Child1)p; Causes RT exception coz here parent ref created using child obj shld be used ..so use p1
//		c1.see1();
//		c1.see2();
//		Child1.show();
		
		Child1 c1 = (Child1)p1; //Downcastong  
		c1.see1(); //P
		c1.see2(); //C
		Child1.show(); //Child Class
		
		
		
		
	}

}

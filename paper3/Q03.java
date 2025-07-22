package in.paper3;
//Abstract class, method, concrete class...Upcasting and Downcasting

abstract class Parent{
	// Abstract method
	abstract void name();
	
	void display() {
		System.out.println("Parent class method");
	}
	
}

class Child extends Parent{

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("Child name method");
	}
	
	void childDisplay() {
		System.out.println("Child class method");
	}
	
}
public class Q03 {
	public static void main(String[] args) {
		
		Parent p = new Child();
		p.display();
		p.name();
		
		Child c = (Child)p;//down
		c.childDisplay();
		
	}

}

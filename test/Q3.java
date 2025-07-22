package in.test;
//Abstract class, method,conc method

abstract class Person{		//abstract class
	abstract void sounds(); // abstract method
	
	void sound1() {
		System.out.println("Parent class");
	}
}

class Man extends Person{
	void sounds() {
		System.out.println("Abstract method called/overriden");
	}
	void show() {
		System.out.println("Child class");
	}
}
public class Q3 {
	public static void main(String[] args) {
//		Man m = new Man();
//		m.sounds();
//		m.sound1();
//		m.show();
		
		Person p = new Man(); //Upcasting
		p.sounds();
		p.sound1();
		
		Man m = (Man)p; //Downcasting
		m.show();
		m.sounds();
		m.sound1();
		
		
	}

}

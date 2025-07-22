package in.paper3;
//Code for method Overloading and method hiding

class Sum{
	public int add(int a, int b) {
		return a+b;
	}
	
	public double add(double a , double b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
}

class Animal{
	static void sound() {
		System.out.println("Animal Sound");
	}
}

class Dog extends Animal{
	static void sound() {
		System.out.println("Dog barks..");
	}
}
public class Q01 {
	
	public static void main(String[] args) {
		//Method Overloading
		Sum s1 = new Sum();
		double a = s1.add(3.3, 3.6);
		int b = s1.add(5, 25);
		int c = s1.add(5, 11, 2);
		System.out.println(a+" "+b+" "+c);
		
		System.out.println("-------------------");
		//Method Hiding
		Animal a1 = new Dog();
		Animal a2 = new Animal();
		Dog d = new Dog();
		//Dog d1 = (Dog) new Animal();
		
		a1.sound();
		a2.sound();
		d.sound();
		//d1.sound();
		
	}

}

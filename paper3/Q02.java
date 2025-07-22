package in.paper3;
//Super keyword

class Animal2{
	void sound() {
		System.out.println("Animal Sond..");
	}
}

class Cat extends Animal2{
	void sound() {
		super.sound();
		System.out.println("Dog barks");
	}
}
public class Q02 {
	public static void main(String[] args) {
		Cat a = new Cat();
		a.sound();
	}

}

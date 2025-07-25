package in.papers.mock;
//Super Keyword

class Animal1{
	Animal1() {
		System.out.println("Animal Sound");
	}
	
	Animal1(String name){
		System.out.println(name);
	}
	
	void display() {
		System.out.println("Animal");
	}
}

class Dog extends Animal1{
	Dog(){
		super();//Calls Animal1
		System.out.println("Dog barks!!!");
	}
	
	Dog(String name){
		super(name);
		System.out.println(name);
	}
	void display() {
		super.display();
		System.out.println("Dog");
	}
	
}

public class SuprKW {
	public static void main(String[] args) {
		Dog d = new Dog();  //Animal Sound, Dog barks 
		d.display(); //Animal Dog
		
		new Dog("Sandy"); // Sandy, Sandy
		
	}
}

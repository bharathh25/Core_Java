package in.papers.mock;
//Constructor Chaining

class Cat{
	
	Cat(){
		this("Kitty",5);
		System.out.println("Cat is good");
	}
	
	Cat(String name, int age){
		System.out.println(name+" "+age);
	}
}
public class ConstrChaining {

	public static void main(String[] args) {
		new Cat();
	}
}

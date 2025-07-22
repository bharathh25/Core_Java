package in.test;
//Method Overloading and hiding

class MathsP{
	int add(int a , int b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	
	int add(int a, int b,int c) {
		return a+b+c;
	}
}


class Food{
	static void name() {
		System.out.println("Indian");
	}
}

class Dish extends Food{
	static void name() {
		System.out.println("Chinese");
	}
}

public class Q1 {
	public static void main(String[] args) {
		Dish d = new Dish();
		Food f = new Dish();// Hiding occurrs only when child object is created for Parent type ref
		Dish d1 = (Dish)d;
		
		d.name();
		f.name(); //Method Hiding
		d1.name();
		System.out.println("-------------------------");
		
		MathsP m = new MathsP();
		System.out.println(m.add(2.3, 40.5)+" "+
		m.add(5, 25)+" "+
		m.add(1, 2, 3));
	}

}

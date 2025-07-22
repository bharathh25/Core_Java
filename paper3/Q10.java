package in.paper3;
//Dynamic PolyMorphism

class Animal3{
	void name() {
		System.out.println("Animal");
	}
}

class Lion extends Animal3{
	void name() {
		System.out.println("Lion");
	}
}

class Tiger extends Animal3{
	void name() {
		System.out.println("Tiger");
	}
}

public class Q10 {
	public static void main(String[] args) {
		Animal3 a ;
		
		a= new Lion();
		a.name();
		
		a=new Tiger();
		a.name();
	}

}

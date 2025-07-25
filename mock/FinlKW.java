package in.papers.mock;
final class End{
	void show() {
		System.out.println("Final class");
	}
}

//class End2 extends End{  //Cant I(nherit
//	
//}

class CheckF{
	final void display() {
		System.out.println("Final Method");
	}
}

//class Check extends CheckF{
//	void display() {					Cant override final method
//		
//	}
//}
public class FinlKW {
	public static void main(String[] args) {
		final String s = "End";
		System.out.println(s);
		
//		s = "End2"; //Cant re assign finalm values
		
	}

}

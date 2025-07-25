package in.papers.mock;
//Abstract

abstract class River{
	abstract void name(); //Abstract method
	
	void show() {
		System.out.println("River");
	}
}

class Ganga extends River{
	void name() {
		System.out.println("River Ganga!!!");
	}
	
	void see() {
		System.out.println("Himalaya");
	}
}
public class Absrct {
	
	public static void main(String[] args) {
		Ganga g = new Ganga();
		g.name(); //River Ganga!!!
		g.see();  //Himalaya
		g.show(); //River
		
		River r = new Ganga(); //Upcasting
		r.show();
		//r.see(); cant
		
		Ganga g1 = (Ganga)r;  //Downcasting
		g1.see(); //Himalaya
		g1.show(); //River
		g1.name(); //River Ganga!!!
	}

}

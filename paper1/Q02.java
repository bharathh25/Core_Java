package in.paper1;
//multiple inheritance possible through interfaces

interface A{
	void check();
}

interface B{
	void ohk();
}

class C implements A,B{

	@Override
	public void ohk() {
		// TODO Auto-generated method stub
		System.out.println("A");
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("B");
	}
	
}
public class Q02 {
	public static void main(String[] args) {
		C a = new C();
		a.check();
		a.ohk();
	}

}

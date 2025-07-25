package in.papers.mock;

interface A1{
	void show();
}

interface B1{
	void see();												
}

class C1  implements A1,B1{

	@Override
	public void see() {
		// TODO Auto-generated method stub
		System.out.println("A");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("B");
	}
	
}
public class MulInherit {
	public static void main(String[] args) {
		C1 c = new C1();
		c.see();
		c.show();
	}
}

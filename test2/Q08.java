package in.test2;
//Final

final class End{
	void last() {
		System.out.println("Final class");
	}
}

//class TestEnd extends End{ // cant inherit
//	
//}

class TestEnd1{
	final void show() {
		System.out.println("Final Method");
	}
}

//class End2 extends TestEnd1{
//	@Override
//	void show() //cant override
//}
public class Q08 {
	public static void main(String[] args) {
		final String name = "Final";
		
		System.out.println(name);
		// name = "New"; //Cant Modify
	}
	

}

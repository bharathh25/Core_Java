package in.paper1;
//Throw and throws

class Test{
	static void checkAge(int a) throws ArithmeticException {
		if(a<18) {
			throw new ArithmeticException("age must be above 18");
		}
		else {
			System.out.println("Eligible");
		}
	}
}
public class Q01 {
	
	public static void main(String[] args) {
		
		try {
			Test.checkAge(8);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}

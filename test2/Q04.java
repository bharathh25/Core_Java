package in.test2;
//Throw And Throws
class Tester{
	static void checkAge(int a) throws ArithmeticException{
		if(a<18) {
			throw new ArithmeticException("Not an adult!!!");
		}else {
			System.out.println("Eligible to vote");
		}
	}
}
public class Q04 {
	public static void main(String[] args) {
		try {
			Tester.checkAge(19);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

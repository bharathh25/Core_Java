package in.test;
//User Defined Exception

class MyException extends Exception{
	MyException(String message){
		super(message);
	}
}

public class Q7 {
	public static void main(String[] args) {
		int age=17;
		
		try {
			if(age<18) {
				throw new MyException("Age isnt above 18");
			}
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}

}

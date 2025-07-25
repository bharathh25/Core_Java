package in.papers.mock;
//User Defined Exception

class MyException extends Exception{
	MyException(String message){
		super(message);
	}
}

class Age{
	void checkAge(int a) throws MyException{
		if(a<18) {
			throw new MyException("Age must be above 18 !!!"); 
		}
		else {
			System.out.println("Can vote :)");
		}
	}
}
public class UsrExcp {
	
	public static void main(String[] args) {
		Age a = new Age();
		
		try {
			a.checkAge(9);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
